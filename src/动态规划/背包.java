package 动态规划;

public class 背包 {

	public static void beibao(int []w,int []v,int c,int number) {
		int [][]m= new int [number+1][c+1];
		for (int i = 0; i <= c; i++) {
			m[0][i] = 0;
		}
		for (int i = 0; i <= number; i++) {
			m[i][0] = 0;
		}
		//System.out.println(number);
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= c; j++) {
				if (j < w[i]) {//装不下
					m[i][j] = m[i-1][j];
				}else if (m[i-1][j] > m[i-1][j - w[i]] + w[i]) {//不装价值大
					m[i][j]= m[i-1][j]; 
				}else {//装了价值大
					m[i][j]=  m[i-1][j - w[i]] + w[i];
				}
			}
		}
		System.out.println(m[number][c]);
	}
	public static void main(String[] args) {
		int []w={0,2,3,4,5};
		int []v={0,3,4,5,6};
		int c = 8;
		int number = w.length - 1;//number=4
		//int [][]m = new int[5][c+1];
		beibao(w, v, c ,number);
	}
}
