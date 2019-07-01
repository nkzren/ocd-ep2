package ocd;

public class PC {
    static private int valorPc = 0;
    static public void incrementaPc(){
        valorPc++;
    }

    static public int get(){
        return valorPc;
    }
    static public set(int valorEntrada){
        this.valorPc = valorEntrada;
    }
}