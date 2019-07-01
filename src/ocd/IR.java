package ocd;

class IR{
	
	private static String opcode;
	public static int porta1;
	public static int porta2;
	
    public IR(int[] vet){
    	opcode = Util.getInstance().intArrayToString(vet);
    	String porta1String = opcode.substring(6, 12);
    	String porta2String = opcode.substring(12);
    	porta1 = Util.getInstance().binaryStringToInt(porta1String);
    	porta2 = Util.getInstance().binaryStringToInt(porta2String);
    }
    
    
}