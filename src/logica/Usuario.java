package logica;

import java.io.Serializable;

//TODO: Nada
public class Usuario implements Serializable{

    private LstInicioSesiones lstInicios;
    private LstCambiosPass lstCambios;
    private Pass contrasenia;
    private String mail;

    public Usuario(String mail) {
        contrasenia = new Pass();
        lstInicios = new LstInicioSesiones(contrasenia);
        lstCambios = new LstCambiosPass(contrasenia);
        this.mail = mail;
        
    }
    
    public LstInicioSesiones devolverInicioSesiones() {
        return this.lstInicios;
    }
    
    public LstCambiosPass devolverCambiosPass() {
        return this.lstCambios;
    }

    public String verCambios() {
        return lstCambios.toString();
    }

    public String verSesiones() {
        return lstInicios.toString();
    }

    public String getMail() {
        return mail;
    }
    
    public Pass getPass() {
        return contrasenia;
    }
    
    /* 
    Operaciones específicas sobre el usuario que implica:
    - La lista de inicio de sesión de un usuario en concreto
    - La lista de cambio de contraseñas de un usuario en concreto
    */

    @Override
    public String toString() {
        return "Usuario:" + mail + "\nInicios de sesion: " + verSesiones()
                + "\ncambios de pass: " + verCambios();
    }

}
