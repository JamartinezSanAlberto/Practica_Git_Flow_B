/*
 * -> Funcionalidad: comprobar que la cadena de carácteres contenga 5 carácteres en mayúsculas. <-
 * -> Autor: Hugo Jiménez (The_Yatagarasu) <-
 * -> Fecha: 03/05/2023 <-
 */
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
