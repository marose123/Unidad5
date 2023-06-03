package Ejercicio3;
import EntradaSalida.Tools; 

public class AlmacenarDatos {
    private String datos[];
    private byte p;

    public AlmacenarDatos(byte tam)
    {
        datos = new String[tam];
        p=-1;
    }

    public boolean validaVacio()
    {
        return(p==-1);
    }

    public boolean validaEspacio(){
        return(p<datos.length-1);
    }
    public void almacenarDatos(String n)
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

        for (int i = 0; i<=p; i++)
        {
            cad+= i+":[" + datos[i] + "]:" +metodos.InvertirCadena(datos[i ])+". Total Caracteres: " + metodos.nChar() + "\n";
        }
        return "\n" + cad;
    }
}
