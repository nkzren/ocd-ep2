package ocd;
import java.util.Scanner;

class Main {
  public static void cicloBusca(){
    for(int i = 0;i < 3;i++){
      System.out.println("Inicia ciclo de busca");
      MAR.set(PC.get());
      MBR.set(Memoria.getValor(MAR.valor));
      IR.define(MBR.get());
      UC(IR.getOpcode());
    }
  }

  public static void UC(String opcode){
    System.out.println("Executa instrução");
    int flag = opcode.charAt(5) - '0';//flag para determinar qual porta da IR será acessada
    PC.incrementaPc();
    if(opcode.substring(0,2).equals("00")){
        //instrução 1 - Coloca endereço 1 no acumulador
        System.out.println("Entrou na execução 1");
        MAR.set(IR.get(flag));
        MBR.set(Memoria.getValor(MAR.valor));
        AC.recebeVetor(MBR.get());
    }
    else if(opcode.substring(0,2).equals("01")){
      //instrução 2 - Soma endereço 2 ao acumulador
      System.out.println("Entrou na execução 2");
      MAR.set(IR.get(flag));
      MBR.set(Memoria.getValor(MAR.valor));
      ULA.send(MBR.get(),IR.getOpcode());
    }
    else if(opcode.substring(0,2).equals("10")){
      System.out.println("Entrou na execução 3");
      //instrução 3 - Coloca acumulador no endereço 1
      MAR.set(IR.get(flag));
      MBR.set(AC.get());
      MBR.insereMemoria(MAR.valor);
    }
    else if(opcode.substring(0,2).equals("11")){
      System.out.println("Entrou na execução 4");
      //instrução 4 - Coloca o endereço 1 no PC
      PC.set(IR.get(flag));
    }
    else{
      System.out.println("Algo deu errado");
    }
    Registradores.imprimir();
  }

  public static void main(String[] args) {
      Registradores.inicializar();
      boolean continua = true;
      Registradores.imprimir();
      while(continua){
      Scanner ler = new Scanner(System.in);
      System.out.println("Insira operação: (ex: ADD AX,BX)");
      String s = ler.nextLine();
      System.out.println("");
      if(s.equalsIgnoreCase("end")){
        System.out.println("Fim da execução");
        continua = false;
      }else {
        Decodificador.decodifica(s);
        cicloBusca();
      }
    }
  }
}