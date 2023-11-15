package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Historial implements Serializable{
    private ArrayList<Pass> lista;
    
    public Historial(){
        lista = new ArrayList<>();
    }
    
    void agregarContrasenia(Pass contrasenia) {
        this.lista.add(contrasenia);
    }
    
    void eliminarContrasenia(Pass contrasenia) {
        this.lista.remove(contrasenia);
    }
    
    void eliminarPorIndiceContrasenia(int indice) {
        this.lista.remove(indice);
    }
    
    void getContrasenia(int index) {
        this.lista.get(index);
    }
    
    
    /* 
    En esta clase se ubican las operaciones comúnes a:
    - Lista de cambios de contraseña
    - Lista de inicios de sesión
    */
    
    /* Métodos primitivos */
    
    
    /* Métodos específicos */
    
//***************************************************************************    
    @Override
    public String toString() {
        return lista.toString();
    }
} // Fin