package cao.test15.��������1�ĸ���;

import org.junit.runner.RunWith;

public class Test {
	@org.junit.Test
	public int NumberOf1(int n) {
		int count = 0;
		while(n != 0){
			++count;
			n = (n-1)&n;
		}
		return count;
    }
	public static void main(String[] args) {
		int ��  = 0;
		System.out.println(��);
	}
}
