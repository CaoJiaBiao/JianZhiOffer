package cao.test10.ì³²¨ÄÇÆõÊıÁĞ;

public class Test {
	public int Fibonacci(int n) {
		int[] result =  {0,1};
		if (n < 2) {
			return result[n];
		}
		int a = 0,b = 1,c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;

	}
}
