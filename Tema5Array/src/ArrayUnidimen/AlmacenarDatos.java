//Arreglos homogeneos
package ArrayUnidimen;
import EntradaSalida.Tools;

public class AlmacenarDatos {
    private Object datos[];
    private byte i;
    
    public AlmacenarDatos(byte max){
        datos=new Object[max];
        i=-1;
    }
    public boolean arrayVacio(){
        return(i==-1);
    }
    public boolean arrayEspacio(){
        return(i<datos.length-1);
    }
    public void insetardatoLectura(Object dato){
        if(arrayEspacio())
        {
            i++;
            datos[i]=dato;
        }else
            Tools.salidaError("Array Lleno");
        }
    public String imprimeDatosArray(){
        
        String cad=" ";
        for(byte j=0;j<=i;j++){
            cad+=j+"["+datos[j]+"]\n";
        }
        return cad;
    }
    public String imprimeArray(int a[]){

        String cad=" ";
        for(byte j=0;j<a.length;j++){
            cad+=j+"["+a[j]+"]\n";

        }
        return cad;
    }
    public String imprimePrimos(){
        String cad=" ";
        for (byte j=0;j<=i;j++){
            if(Metodos.esPrimo((int)datos[j]))
                cad+=j+" ["+datos[j]+"]\n";
        }
        return cad;
    }
    public String convertirABinario(){
        String cad ="";
        for (byte j=0;j<=i;j++) {
            cad += j + " [" + datos[j] + "]: " + Metodos.binario((int) datos[j]) + "\n";

        }
        return cad;
    }

    public String imprimeFrecuencia() {
        String cad = "";
        for (byte j=0;j<=i;j++) {
            cad += j + " [" + datos[j] + "]: " + Metodos.Frecuencia((int) datos[j]) + "\n";

        }
        return cad;
    }
    //if (y % 2 == 1) {
    //                    calculo += y + " ";
    //                }
    public String imprimeTriangulo(){
        String cad = "";
        for (byte j = 0; j <= i; j++) {
            cad += j + " [" + datos[j] + "]: " + Metodos.filasDigitos((int) datos[j]) + "\n";
        }
        return cad;
    }
    public String imprimesumaDigitos(){
        String cad=" ";
        for (byte j = 0; j <= i; j++){

            cad+=j+"["+datos[j]+"]:"+Metodos.sumaDigitos((int) datos[j])+"\n";
        }
         return cad;
    }
    public String sumaDigitos(int a[]){
        String cad=" ";
        for (byte j = 0; j <= a.length-1; j++){

            cad+=j+"["+a[j]+"]:"+Metodos.sumaDigitos((int) a[j])+"\n";
        }
        return cad;
    }


}

