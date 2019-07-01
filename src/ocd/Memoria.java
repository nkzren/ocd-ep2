package ocd;

import java.util.ArrayList;
import java.util.List;

public class Memoria{
    // private static List<int[]> memoria = new ArrayList<int[]>();
    private static int[][] memoria = new int[63][18];
    private static int contIndice = 0;
    public static int[] getValor(int indice){
        return memoria[indice+4];
    }
    public static void add(int[] palavra){
    	// System.out.println("ADICIONA PALAVRA NA MEMORIA");
        memoria[contIndice] = palavra;
        contIndice++;
    }
    public static void addIndice(int indice, int[] palavra){
    	memoria[indice] = palavra;
    }
    public static void imprime(int i){
        System.out.println(Util.getInstance().intArrayToString(memoria[i]));
    }
}