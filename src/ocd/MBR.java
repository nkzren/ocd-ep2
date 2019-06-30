package ocd;

public class MBR{
    static private int valor;

    static public void set(int[] memoria){
        this.valor = memoria;
    }
    public static escreveMemoria(){
        Memoria.add(this.valor)
    }
}