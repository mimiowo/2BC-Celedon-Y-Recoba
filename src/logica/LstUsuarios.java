package logica;

import java.io.Serializable;
import java.util.ArrayList;

//TODO: Métodos específicos propuestos y métodos específicos a medida que los necesitemos

public class LstUsuarios implements Serializable {

    private ArrayList<Usuario> lista;

    public LstUsuarios() {
        lista = new ArrayList<>();
    }

    /* Métodos primitivos */
    public void agregar(Usuario u) {
        lista.add(u);    
    }
    public void eliminar(Usuario u) {
        lista.remove(u);
    }
    public void eliminar(int i) {
        lista.remove(i);
    }
    public int cantidad() {
        return lista.size();
    }
    public Usuario devolver(int i) {
        return lista.get(i);
    }
    public boolean sinRegistros() {
        return lista.isEmpty();
    }
    
   public String devolverMailUsuario (int index) {
        return lista.get(index).getMail();
    }
    
    public Usuario devolver (String mail) {
        for (Usuario i : lista) {
            if (i.getMail().equals(mail)){
                return i;
            }
        }
        return null;
    }
    
    public boolean existePorMail(String mail) {
        for (Usuario i : lista) {
            if (i.getMail().equals(mail))
                return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
