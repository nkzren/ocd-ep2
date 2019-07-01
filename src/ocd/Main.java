import java.util.Scanner;

class Main {
  public static void cicloBusca(){
      MAR.set(PC.get());
      MBR.set(Memoria.getValor(MAR.valor));
      IR.define(MBR.get());
      UC(IR.getOpcode());
  }

  public static void UC(String opcode){
    int flag = 0;
    PC.incrementaPc();
    if(opcode.equals("00")){
        //instrução 1 - Coloca endereço 1 no acumulador
        MAR.set(IR.get(flag));
        MBR.set(Memoria.getValor(MAR.valor));
        AC.recebeVetor(MBR.get());
    }
    if(opcode.equals("01")){
      //instrução 2 - Soma endereço 2 ao acumulador
      flag = 1;
      MAR.set(IR.get(flag));
      MBR.set(Memoria.getValor(MAR.valor));
      ULA.send(MBR.get(),IR.getOpcode());
    }
    if(opcode.equals("10")){
      //instrução 3 - Coloca acumulador no endereço 1
      flag = 0;
      MAR.set(IR.get(flag));
      MBR.set(Memoria.getValor(MAR.valor));
      MBR.insereMemoria();
    }
    if(opcode.equals("11")){
      //instrução 4 - Coloca o endereço 1 no PC
      PC.set(IR.get(flag));
    }
  }

  public static void main(String[] args) {
      Util.inicializaR();
      boolean continua = true;
      while(continua){
      System.out.print("AX: ");
      Memoria.imprime(0);
      System.out.print("BX: ");
      Memoria.imprime(1);
      System.out.print("CX: ");
      Memoria.imprime(2);
      System.out.print("DX: ");
      Memoria.imprime(3);
      Scanner ler = new Scanner(System.in);
      System.out.println("Insira operação: (ex: ADD AX,BX)");
      String s = ler.nextLine();
      if(s.equals("end")){
        System.out.println("Fim da execução");
        continua = false;
      } 
      Decodificador.decodifica(s);
      cicloBusca();
    }
  }
}