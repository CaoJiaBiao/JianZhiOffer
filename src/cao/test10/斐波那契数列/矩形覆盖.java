package cao.test10.斐波那契数列;

public class 矩形覆盖 {
	public int RectCover(int n) {
		int[] result = { 0, 1, 2 };
		if (n < 3) {
			return result[n];
		}
		int a = 1, b = 2, c = 0;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
