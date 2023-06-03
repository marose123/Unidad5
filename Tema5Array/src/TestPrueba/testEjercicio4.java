package TestPrueba;
import EntradaSalida.*;
import Ejercicio4.*;

public class testEjercicio4 {
    public static void main(String[] args) {
        String menu = "Agregar,Imprimir,Salir";
        menuArray(menu);
    }

    public static void menuArray(String menu){
        
        String sel= "";

        AlmacenarDatos  Arreglo = new AlmacenarDatos((byte)30);

        do{
            sel= Tools.boton(menu);
            switch(sel){
                case "Agregar":
                if(Arreglo.validaEspacio())
                    Arreglo.almacenarDatos(Tools.leerInt("Ingrese la cantidad de carreras que realizo en el dia."));
                else
                    Tools.imprimePantalla("Arreglo Lleno");
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
