package ocd;

public class MBR{
    static private int[] valor;

    static public void set(int[] memoria){
        valor = memoria;
    }
    public static int[] get(){
        return valor;
    }
    public static void insereMemoria(){
        Memoria.addIndice(IR.get(0), valor);
    }
}