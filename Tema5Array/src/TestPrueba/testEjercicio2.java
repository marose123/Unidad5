package TestPrueba;
import Ejercicio2.*;
import EntradaSalida.*;

public class testEjercicio2 {
    public static void main(String[] args) {
        String menu = "Agregar,Imprimir,Calcular,Salir";
        menuArray(menu);
    }
    public static void menuArray(String menu){
        
        String sel= "";

        byte tam = Tools.leerByte("Ingrese el tamaño del arreglo a utilizar.");
        AlmacenarDatos  Arreglo = new AlmacenarDatos(tam);

        do{
            sel= Tools.boton(menu);
            switch(sel){
                case "Agregar":
                if(Arreglo.validaEspacio())
                    Arreglo.almacenarDatos(Tools.leerInt("Ingrese una altura"));
                else
                    Tools.imprimePantalla("Arreglo Lleno");
                    break;
                case "Imprimir":
                    if(Arreglo.validaVacio())
                        Tools.imprimePantalla("Arreglo Vacio");
                    else 
                        Tools.imprimePantalla(Arreglo.imprimeDatos()); 
                        
                    break;
                case "Calcular":
                    if(Arreglo.validaVacio())
                        Tools.imprimePantalla("Arreglo Vacio");
                    else
                        Tools.imprimePantalla(Arreglo.minmaxMedia()); 
                    break;
                
                case "Salir": break;

            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
