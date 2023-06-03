package TestPrueba;

import Ejercicio1.*;
import EntradaSalida.Tools;

import java.util.Random;

public class testEjercicio1 {
    public static void main(String[] args) {
        String menu = "Llenar,Vaciar,Pares,Impares,Ceros,Medias,Imprimir,Salir";
        menuArray(menu);
    }

    public static void menuArray(String menu){
        Random aleatorio = new Random();
        String sel= "";

        byte tam = Tools.leerByte("Ingrese el tamaño del arreglo a utilizar.");
        AlmacenarDatos  Arreglo = new AlmacenarDatos(tam);

        do{
            sel= Tools.boton(menu);
            switch(sel){
                case "Llenar":
                    do {
                        Arreglo.almacenarDatos((byte)aleatorio.nextInt(10));
                    }while(Arreglo.validaEspacio());

                    Tools.imprimePantalla(Arreglo.imprimeDatos());
                    break;
                case "Vaciar":
                    Arreglo = new AlmacenarDatos(tam);
                    Tools.imprimePantalla("Arreglo Vaciado");
                    break;
                case "Imprimir":
                    if(Arreglo.validaVacio())
                        Tools.salidaError("Arreglo Vacio");
                    else{
                    Arreglo.imprimeDatosPares();
                    Arreglo.imprimeDatosImpares();
                    Arreglo.imprimeCeros();
                    Tools.imprimePantalla(Arreglo.imprTotal());
                    }
                    break;
                case "Pares":
                    if(Arreglo.validaVacio())
                        Tools.salidaError("Arreglo Vacio");
                    else
                        Tools.imprimePantalla(Arreglo.imprimeDatosPares());
                    break;
                case "Impares":
                    if(Arreglo.validaVacio())
                        Tools.salidaError("Arreglo Vacio");
                    else
                        Tools.imprimePantalla(Arreglo.imprimeDatosImpares());
                    break;
                case "Ceros":
                    if(Arreglo.validaVacio())
                        Tools.salidaError("Arreglo Vacio");
                    else
                        Tools.imprimePantalla(Arreglo.imprimeCeros());
                    break;    
                case "Medias":
                    Tools.imprimePantalla("Media de pares: "+Arreglo.mediaPares()+"\nMedia de Impares: " + Arreglo.mediaImpares()
                    +"\nTotal De Ceros: " + Arreglo.ceros());
                    break;    

                case "Salir": break;

            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
