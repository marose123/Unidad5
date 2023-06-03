package TestPrueba;
import EntradaSalida.*;
import Ejercicio3.*;

public class testEjercicio3 {
    public static void main(String[] args) {
        String menu = "Agregar,Imprimir,Salir";
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

                    Arreglo.almacenarDatos(Tools.leerString("Ingrese una cadena de caracteres"));
                    break;
                case "Imprimir":
                    if(Arreglo.validaVacio())
                        Tools.imprimePantalla("Arreglo Vacio");
                    else 
                        Tools.imprimePantalla(Arreglo.imprimeDatos()); 
                        
                    break;
                
                case "Salir": break;

            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
