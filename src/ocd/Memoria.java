package ocd;

public class memoria{
    private static ArrayList<String> memoria = new ArrayList();
    public static int[] getValor(int indice){
        return memoria.get(indice+4);
    }
    public static void add(int[] palavra){
        memoria.add(palavra);
    }
}