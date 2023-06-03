package Ejercicio3;

public class metodos {

    static byte nChar;

    public static String InvertirCadena(String cadena) {
        nChar =0;
        String cadenaInvertida = "";
        for (int x = cadena.length() - 1; x >= 0; x--){
            nChar++;
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        }
        return cadenaInvertida;
    }
    public static byte nChar(){
        return nChar;
    }
}