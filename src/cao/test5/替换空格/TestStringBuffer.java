package cao.test5.�滻�ո�;

public class TestStringBuffer {
	public static String replaceSpace(StringBuffer str) {
		if (str.length() == 0 || str == null) {
			return "";
		}
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				stringBuffer.append("%20");
			}else {
				stringBuffer.append(str.charAt(i));
			}
		}
		return stringBuffer.toString();
	}
}
