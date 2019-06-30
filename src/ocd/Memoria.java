package ocd;

public class memoria{
    private static ArrayList<int[]> memoria = new ArrayList<int[]>();
    public static int[] getValor(int indice){
        return memoria.get(indice+4);
    }
    public static void add(int[] palavra){
        memoria.add(palavra);
    }
    public static void add(int[] palavra){
        memoria.add(IR.porta1, palavra);
    }
}