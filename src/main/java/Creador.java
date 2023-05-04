import java.util.Random;

public class Creador {
    /*
        Autor: Diego Lacasa Montes
        Fecha: 26/04/2023
        Funcionalidad: Crear sequencia aleatoria de letras mayusculas
     */
    public static String crearClave(int numLetras) {
        Random random = new Random();
        String clave = "";
        for(int contador = 0; contador<numLetras; contador++) {
            char letra = (char)  (random.nextInt(26)+'A');
            clave = clave + letra;
        }
        return clave;
    }
}
