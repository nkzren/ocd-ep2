package ocd;

import java.util.ArrayList;
import java.util.List;

public class Memoria{
    private static List<String> memoria = new ArrayList<String>();
    public static int[] getValor(int indice){
        return memoria.get(indice+4);
    }
    public static void add(int[] palavra){
        memoria.add(palavra);
    }
}