package ocd;

class IR{
	
	public static String opcode;
	public static int porta1;
	public static int porta2;
	
    public IR(int[] vet){
    	String fullCode = Util.getInstance().intArrayToString(vet);
    	String porta1String = fullCode.substring(6, 12);
    	String porta2String = fullCode.substring(12);
    	
    	opcode = fullCode.substring(0, 6);
    	porta1 = Util.getInstance().binaryStringToInt(porta1String);
    	porta2 = Util.getInstance().binaryStringToInt(porta2String);
    }
    
    
}