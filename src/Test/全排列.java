package Test;

public class È«ÅÅÁĞ {
	public static void pailie(char [] string) {
		
	}
	public static void name(char [] string) {
		if (string == null||string.length == 0) {
			return;
		}
		for (int i = 0; i < string.length; i++) {
			pailie(string);
		}
	}
	public static void main(String[] args) {
		char [] test = {'a','b','c','d'};
		name(test);
	}
}
