package cao.test5.替换空格;

/*
 * 没写出来
 */

public class TestOriginal {
	public static String replaceSpace(StringBuffer str) {
		if (str.length() == 0 || str == null) {
			return "";
		}
		int blankCount = 0;
		int newStrLength = 0;
		//空格数量
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				blankCount++;
			}
		}
		newStrLength = str.length() + blankCount*2;
		
		return "";
	}
}
