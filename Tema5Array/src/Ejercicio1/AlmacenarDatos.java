package Ejercicio1;

import EntradaSalida.Tools;

public class AlmacenarDatos {
    private byte datos[];
    private byte p;
    private byte pares,contPares;
    private byte impares,contImpares;
    private byte contCeros;
    public AlmacenarDatos(byte tam)
    {
        datos = new byte[tam];
        p=-1;
    }

    public boolean validaVacio()
    {
        return(p==-1);
    }

    public boolean validaEspacio(){
        return(p<datos.length-1);
    }
    public void almacenarDatos(byte n)
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
            cad+= i+":[" + datos[i] + "]" + "\n";
        }
        return "\n" + cad;
    }

    public byte busquedaSecuencial(Object val)
    {
        byte i=0;
        while(i<=p && !val.equals(datos[i]))
            i++;
        return(i<=p)? i:-1;
    }

    public void modificarDato(byte pos){

        byte val=0;
        val = Tools.leerByte("Ingrese el nuevo dato");
        for (int j = pos; j<= pos; j++){
            datos[j] = val;
        }
    }

    public void eliminaDatos(int pos)
    {
        for (int j=pos; j<= p; j++)
        {
            datos[j]= datos[j+1];
        }

        p--;
    }
    public String imprimeDatosPares()
    {
        contPares =0;
        pares=0;
        String cad="";
        for (int i = 0; i<=p; i++)
        {
            if(metodos.nPar(datos[i])){
                cad+= i+":[" + datos[i] + "]" + ": Es Par"+ "\n";
                pares+=datos[i];
                contPares++;
            }
            
        }
        cad+="\nTotal de Pares:" + contPares;
        return "\n" + cad;
    }
    public String imprimeDatosImpares()
    {
        contImpares=0;
        impares =0;
        String cad="";
        for (int i = 0; i<=p; i++)
        {
            if(metodos.nImpar(datos[i])){
                cad+= i+":[" + datos[i] + "]" + ": Es Impar"+ "\n";
                impares+=datos[i];
                contImpares++;
            }
        }
        cad+="\nTotal de Impares:" + contImpares;
        return "\n" + cad;
    }
    public String imprimeCeros()
    {
        contCeros=0;
        
        String cad="";
        for (int i = 0; i<=p; i++)
        {
            if(metodos.nCero(datos[i])){
                cad+= i+":[" + datos[i] + "]" + ": Es Cero"+ "\n";
                contCeros++;
            }
        }
        cad+="\nTotal de Ceros:" + contCeros;
        return "\n" + cad;
    }

    public float mediaPares(){
        float media=0;
        media = pares/contPares;
        return media;
    }

    public float mediaImpares(){

        float media =0;
        media = impares/contImpares;
        return media;
    }
    public byte ceros(){
        return contCeros;
    }

    public String imprTotal(){

        String cad="";
        for (int i = 0; i<=p; i++){
            if(metodos.nPar(datos[i]))
                cad+= i+":[" + datos[i] + "]" + ": Es Par"+ "\n";
            else
                if(metodos.nImpar(datos[i]))
                    cad+= i+":[" + datos[i] + "]" + ": Es Impar"+ "\n";
                else 
                    if(metodos.nCero(datos[i]))
                        cad+= i+":[" + datos[i] + "]" + ": Es Cero"+ "\n";
        }
        return cad;

    }



    
}
