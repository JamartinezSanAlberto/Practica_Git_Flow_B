public class Generador {
    /*
        Autor: Mario Nadal Ara
        Fecha: 26/04/2023
        Funcionalidad: Comprobar palabra introducida por el usuario con la creada por el programa dependiendo de la posicion de las letras
    */
    public static String generar_pista(String primeraPalabra, String segundaPalabra){
        String comprobacionPalabra = "";
        for(int contador = 0; contador<segundaPalabra.length();contador++){
            if(primeraPalabra.charAt(contador)==segundaPalabra.charAt(contador)){
                comprobacionPalabra = comprobacionPalabra + "O";
            }else if (primeraPalabra.contains(String.valueOf(segundaPalabra.charAt(contador)))){
                comprobacionPalabra = comprobacionPalabra + "X";
            }else{
                 comprobacionPalabra = comprobacionPalabra + "-";
            }
        }
        System.out.println(comprobacionPalabra);
        return comprobacionPalabra;
    }
}
