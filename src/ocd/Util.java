package ocd;

public class Util {
	
	private static Util instance;
	
	private Util() {
		
	}
	
	public static Util getInstance() {
		if (instance == null) {
			instance = new Util();
		}
		return instance;
	}
	
	public String intArrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i : array) {
			sb.append(i);
		}
		return sb.toString();
	}
	
	public int binaryStringToInt(String string) {
		return Integer.parseInt(string, 2);
	}

}
