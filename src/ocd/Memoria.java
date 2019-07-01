package ocd;

import java.util.ArrayList;
import java.util.List;

public class Memoria{
    private static List<int[]> memoria = new ArrayList<int[]>();
    public static int[] getValor(int indice){
        return memoria.get(indice+4);
    }
    public static void add(int[] palavra){
    	System.out.println("ADICIONA PALAVRA NA MEMORIA");
        memoria.add(palavra);
    }
    public static void addIndice(int[] palavra){
    	memoria.add(IR.porta1, palavra);
    }
}