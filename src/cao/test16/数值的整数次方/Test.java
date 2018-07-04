package cao.test16.数值的整数次方;

public class Test { 
	
	public double PowerWithUnsignedExponent(double base,int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		}
		double result = PowerWithUnsignedExponent(base, exponent>>1);
		result*=result;
		if ((exponent & 0x1) == 1) {
			result *= base;
		}
		return result;
	}

	public double Power(double base, int exponent) {
		if (base == 0 && exponent < 0) {
			return 0.0;
		}
		int absExponent = exponent;
		if (exponent < 0) {
			absExponent = -exponent;
		}
		double result = PowerWithUnsignedExponent(base, absExponent);
		if (exponent < 0) {
			result = 1.0/result;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
