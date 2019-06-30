package ocd;

public class MBR{
    static private int valor;
    static private String instrucao;

    static public void(memoria memoria){
        memoria.valor = this.valor;
        memoria.instrucao = this.instrucao;
    }

    static public setValor(int i){
        valor = i;
    }

    static public setInstrucao(String i){
        instrucao = i;
    }
}