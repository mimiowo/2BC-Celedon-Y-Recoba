package logica;

//TODO: Métodos específicos a medida que los necesitemos, constructores, getters, setters, etc

public class LstCambiosPass extends Historial {
    
    private boolean habilitado;
    private int intentos;
    private Instante instante;
    private Pass currentPass;
    
    public LstCambiosPass(Pass currentPass) {
        this.habilitado = true;
        this.intentos = 0;
        this.instante = new Instante();
        this.currentPass = currentPass;
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
            this.currentPass = new Pass(conseguirNuevaContrasenia(), new Instante());
            agregarContrasenia(new Pass(currentPass.getContrasenia(), new Instante()));
            this.instante = new Instante();
            return true;
        } else {
            return false;
        }
    }
    
    private String conseguirNuevaContrasenia() {
        return "";
    }

    @Override
    public String toString() {
        return "Lista: " + super.toString();
    }
 
}


