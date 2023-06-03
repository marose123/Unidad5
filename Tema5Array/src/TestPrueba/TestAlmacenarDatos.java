package TestPrueba;//package TestPrueba;    

import java.util.Random;
import EntradaSalida.Tools;
import ArrayUnidimen.AlmacenarDatos;

public class TestAlmacenarDatos {
    public static void main(String [] args){
        
        menuArray("Aleatorio,Leer,Binarios,Constantes,Primos,Triangulo,Frecuencia,sumaDigitos,Ejercicio1,Ejercicio2,Ejercicio3,Ejercicio4,Imprimir,Salir");
        
    }
    public static void menuArray(String menu){
        AlmacenarDatos dat=new AlmacenarDatos((byte)10);
        int a[]={35,-12,41,82,35,247,-71};
        int dato;
        String sel= "";
        
        do{
            sel=Tools.boton(menu);
            switch(sel){
                case "Aleatorio":
                    Random aleatorio=new Random();
                    dato=aleatorio.nextInt(30);
                    dat.insetardatoLectura(dato);
                    Tools.imprimePantalla("Datos almacenados:\n"+dat.imprimeDatosArray());
                break;
                case "Leer":
                    dato=Tools.leerInt("Dar un Entero: ");
                    dat.insetardatoLectura(dato);
                    Tools.imprimePantalla("Datos almacenados:\n"+dat.imprimeDatosArray());
                break;
                case"Binarios":
                    Tools.imprimePantalla(dat.convertirABinario());
                    break;
                case "Constantes":

                    Tools.imprimePantalla("Datos almacenados:\n"+ dat.imprimeArray(a));
                break;
                case "Primos":
                    if(dat.arrayVacio())
                        Tools.salidaError("Array Vacio..insertar datos");
                    else
                        Tools.imprimePantalla("Numeros Primos:\n"+dat.imprimePrimos());
                break;
               case "Triangulo":
                   Tools.imprimePantalla("Triangulos:\n"+dat.imprimeTriangulo());
                    break;
                case "Frecuencia":
                    if(dat.arrayVacio())
                        Tools.salidaError("Array Vacio..insertar datos");
                    else
                        Tools.imprimePantalla("Frecuencia:\n"+dat.imprimeFrecuencia());
                    break;
                case "sumaDigitos":
                    Tools.imprimePantalla("Arreglo Estatico:");
                    Tools.imprimePantalla("Suma de sus digitos:\n"+dat.sumaDigitos(a));
                    Tools.imprimePantalla("Arreglo dinamico:");
                    if(dat.arrayVacio())
                        Tools.salidaError("Array Vacio..insertar datos");
                    else
                        Tools.imprimePantalla("Suma de sus digitos:\n"+dat.imprimesumaDigitos());
                    break;
                case "Imprimir": 
                    if(dat.arrayVacio())
                        Tools.salidaError("Array Vacio..insertar datos");
                    else
                        Tools.imprimePantalla("Datos almacenados:\n"+dat.imprimeDatosArray()+"Numeros Primos:\n"+dat.imprimePrimos());
                break;
                case "Ejercicio1":
                    testEjercicio1.menuArray("Llenar,Vaciar,Pares,Impares,Ceros,Medias,Imprimir,Salir");
                break;
                case "Ejercicio2":
                    testEjercicio2.menuArray("Agregar,Imprimir,Calcular,Salir");
                break;
                case "Ejercicio3":
                    testEjercicio3.menuArray("Agregar,Imprimir,Salir");
                break;
                case "Ejercicio4":
                    testEjercicio4.menuArray("Agregar,Imprimir,Salir");
                break;
                case "Salir": break;  
                    
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}

