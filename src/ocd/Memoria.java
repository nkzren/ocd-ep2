package ocd;

<<<<<<< HEAD
public class memoria{
    private static ArrayList<int[]> memoria = new ArrayList<int[]>();
=======
import java.util.ArrayList;
import java.util.List;

public class Memoria{
    private static List<String> memoria = new ArrayList<String>();
>>>>>>> 1abda3692dec501cc5b7f8b3a0ee65c2ab444a19
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