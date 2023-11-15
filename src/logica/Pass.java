package logica;

import java.io.Serializable;
import java.util.Random;

//TODO: Políticas de contraseña
public class Pass implements Serializable {

    private Instante instante;
    private String contrasenia;
    private Random azar;

    public Pass() {
        this.azar = new Random();
        this.instante = new Instante();
        this.contrasenia = generarContrasenia();
    }

    public Pass(String contrasenia, Instante instante) {
        this.azar = new Random();
        this.instante = instante;
        this.contrasenia = contrasenia;
    }

    public void cambiarContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    private String generarContrasenia() {
        char[] mayuscula = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] minuscula = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] numero = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        StringBuilder caracteres = new StringBuilder()
                .append(mayuscula)
                .append(minuscula)
                .append(numero);

        StringBuilder contrasenia = new StringBuilder();

        for (int i = 0; i <= 7; i++) {
            int cantCaracteres = caracteres.length();
            int numRandom = azar.nextInt(cantCaracteres);
            contrasenia.append(caracteres.toString().charAt(numRandom));
        }
        
        return contrasenia.toString();
    }

    //<
    public String getContrasenia() {
        return contrasenia;
    }

    /* En esta clase se ubican las 
    politicas de contraseña */
    @Override
    public String toString() {
        return "\n[" + contrasenia + "]" + "{" + instante + "}";
    }
}
