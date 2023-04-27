import java.util.*;
public class Comprobador {
    private static boolean Comprueba(String palabra, Integer longitud){
        if(palabra.length()==longitud && palabra.equals(palabra.toUpperCase())){
            return true;
        }
        else{
            return false;
        }
    }
}
