package Ejercicio2;
import EntradaSalida.Tools; 

public class AlmacenarDatos {
    private Integer datos[];
    private byte p;
    private int mayor;
    private int menor;

    public AlmacenarDatos(int tam)
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
        System.out.println(p);
        if(p< datos.length)
        {
            datos[p+1] = n;
            p++;
            System.out.println(p);
        }
        else
            Tools.imprimePantalla("Arreglo Lleno.");
    }

    public String imprimeDatos()
    {
        String cad="";

        for (int i = 0; i<=p; i++)
        {
            cad+= "Persona "+i+":[" + datos[i] + "cm]\n";
        }
        return "\n" + cad;
    }

    public String minmaxMedia(){

        String cad="";
        String cad2="";

        for (int i = 0; i<=p; i++)
        {
            if(datos[i]>mediaAlt()){
                cad+="Persona "+(i+1)+":[" + datos[i] + "cm]\n";
                mayor++;
            }
            else {
                cad2+="Persona "+(i+1)+":[" + datos[i] + "cm]\n";
                menor++;
            }
        }
        return "Media: " + mediaAlt() + "\nMayor a la media:"+mayor+"\n" + cad+"\nMenor a la media:"+menor+"\n"+cad2;
    }
    public int mediaAlt(){
        int media=0;
        for(int i =0;i<=p;i++){
            media+=datos[i];
        }
        media=media/(p+1);    
        return media;
    }
    
}
