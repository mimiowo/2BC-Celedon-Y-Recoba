package logica;

//TODO: Nada

public class LstInicioSesiones extends Historial {
    private boolean habilitado;
    private int intentos;
    private Instante instante;
    private Pass pass;

    public LstInicioSesiones(Pass pass) {
        this.habilitado = true;
        this.intentos = 0;
        this.instante = new Instante();
        this.pass = pass;
    }
    
    public boolean isHabilitado() {
        return this.habilitado;
    }
    
    public int getIntentos() {
        return this.intentos;
    }
    
    public void sumarIntento() {
        this.intentos++;
        
        if (intentos == 3)
            cambiarHabilitacion();
    }
    
    private void cambiarHabilitacion () {
        this.habilitado = !habilitado;
    }
    
    public Instante getInstante(){
        return this.instante;
    }
    
    public boolean actualizarLista() {
        if (habilitado) {
            agregarContrasenia(new Pass(pass.getContrasenia(), new Instante()));
            this.instante = new Instante();
            return true;
        } else {
            return false;
        }
    }
    
    /* 
    En esta clase las operaciones específicas (si las hay)
    de la lista de inicio de sesión
    */
    
    
//***************************************************************************    
    @Override
    public String toString() {
        return super.toString();
    }
}
