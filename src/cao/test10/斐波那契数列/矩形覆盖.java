package cao.test10.쳲���������;

public class ���θ��� {
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
