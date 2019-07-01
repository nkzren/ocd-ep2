package ocd;

public class PC {
    static private int memoriaPc = 0;
    static public void incrementaPc(){
        memoriaPc++;
    }

    static public int get(){
        return memoriaPc;
    }
}