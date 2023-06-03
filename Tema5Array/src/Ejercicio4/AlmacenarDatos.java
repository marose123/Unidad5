package Ejercicio4;
import EntradaSalida.Tools; 

public class AlmacenarDatos {
    private Integer datos[];
    private byte p;

    public AlmacenarDatos(byte tam)
    {
        datos = new Integer[tam];
        p=-1;
    }

    public boolean validaVacio()
    {
        return(p==-1);
    }

    public boolean validaEspacio(){
        return(p<datos.length-1);
    }
    public void almacenarDatos(int n)
    {
        if(p< datos.length)
        {
            datos[p+1] = n;
            p++;
        }
        else
    Tools.imprimePantalla("Arreglo Lleno.");
    }

    public String imprimeDatos()
    {
        String cad="";
        int dinero =0;
        for (int i = 0; i<=p; i++)
        {
            cad+= i+":[" + datos[i] + "]: Total Pagado:" + calc(i) +"\n";
        }

        cad+="\n Dia con mas carreras realizadas: " + encontrarMayor()+ " con " + datos[encontrarMayor()] + " carreras.";
        for(int i =0;i<=p;i++){
            dinero += calc(i)
            ;
        }
        cad+= "\nTotal de dinero adquirido durante el mes: " + dinero;
        cad+= "\nPromedio de carreras realizadas: " + prom();
        return "\n" + cad;
    }

    public int calc(int i){
        int carreras =0;
        
        if(datos[i]<=10)
            carreras = datos[i]*1500;
        else
            if(datos[i]>10 && datos[i]<=30)
                carreras = datos[i]*3500;
            else
                if(datos[i]>30)
                    carreras = datos[i]*3500;
        return carreras;
    }
    
    public int encontrarMayor() {
        int mayor =datos[0];
        int j=0;
        for (int i = 1; i<=p; i++) {
            if(datos[i] > mayor) {
                mayor =datos[i];
                j=i;
            }
        }
        
        return j;
    }

    public int prom(){
        int prom =0;

        for(int i = 0; i<=p; i++){
            prom+=datos[i];
        }

        prom = prom/p;
        

        return prom;
    }
}
/*Crear un método donde un taxista almacene en un arreglo unidimensional de 30 posiciones el número de
carreras diarias que ha realizado en cada uno de los días del mes. El dueño del taxi ha decidido pagarle por
cada día trabajado, de la siguiente manera:
a. Si en el día hizo menos de 10 carreras, le pagará a $1500 por carrera.
b. Si en el día hizo entre 11 y 30 carreras, le pagará a $3500 cada carrera.
c. Si en el día hizo más de 30 carreras, cada carrera se la pagará a 5000.
d. Hallar el día en que más carrera hizo
e. Hallar el total de dinero que hizo el taxista en el mes
f. Determinar el promedio de carreras hechas por el taxista. */