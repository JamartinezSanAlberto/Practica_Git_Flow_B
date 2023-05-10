import java.util.Scanner;

public class main {
    public static void main(String[] args){
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int intentos = 10;
        String palabraSecreta = Creador.crearClave(5);
        Comprobador.Comprueba(palabraSecreta, 5);
        String palabraUsuario = "";
        //Presentación
        System.out.println("Bienvenido a el Wordle barato");
        System.out.println("¿Podrás adivinar la palabra de 5 letras? ¡¿En tan solo "+intentos+" intentos?!");
        System.out.println(palabraSecreta);
        while(intentos>0 && !palabraSecreta.equals(palabraUsuario)){
            System.out.println("Intenta adivinar la palabra");
            palabraUsuario = sc.next();
            if(Comprobador.Comprueba(palabraUsuario, 5)){
                Generador.generar_pista(palabraSecreta, palabraUsuario);
                intentos --;
                if(!palabraSecreta.equals(palabraUsuario)){
                    System.out.println("Te quedan " + intentos + " intentos");
                }
            }else{
                System.out.println("PALABRA NO VALIDA");
            }
        }
        if(!palabraSecreta.equals(palabraUsuario)){
            System.out.println("Has perdido");
            System.out.println(palabraSecreta);
        }else{
            System.out.println("Enhorabuena, tenga buena tarde :)");
            System.out.println("Has tardado "+ (10-intentos) +" intentos");
        }

    }
}
