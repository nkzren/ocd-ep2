public class Registradores{
    public static void inicializar(){
        int[] codigo = new int[18];
        for(int i = 0;i<18;i++){
        codigo[i] = 0;
        }
        Memoria.add(codigo);
        Memoria.add(codigo);
        Memoria.add(codigo);
        Memoria.add(codigo);
        MBR.set(codigo);
        IR.define(codigo);
        AC.recebeVetor(codigo);
    }
    public static void imprimir(){
        System.out.println("REGISTRADORES:");
        System.out.print("AX: ");
        Memoria.imprime(0);
        System.out.print("BX: ");
        Memoria.imprime(1);
        System.out.print("CX: ");
        Memoria.imprime(2);
        System.out.print("DX: ");
        Memoria.imprime(3);
        System.out.println("");

        int pc = PC.get()-4;
        System.out.println("PC: "+pc);
        System.out.println("MAR: "+MAR.valor);
        System.out.println("MBR: "+Util.getInstance().intArrayToString(MBR.get()));
        String porta1 = Integer.toBinaryString(IR.get(0));
		String porta2 = Integer.toBinaryString(IR.get(1));
		System.out.println("IR: "+IR.getOpcode()+Util.getInstance().lpad(porta1, 6) + Util.getInstance().lpad(porta2, 6));
        System.out.println("AC: "+Util.getInstance().intArrayToString(AC.get()));
        System.out.println("------------------------------");
    }
}