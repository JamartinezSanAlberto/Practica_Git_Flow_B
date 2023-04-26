public class Generador {
    public static void main(String[] args){
        generar_pista();
    }
    public static String generar_pista(){
        //Accedo a las palabras
        String primeraPalabra = "peter";
        String segundaPalabra = "penta";
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
