package cao.test4.二维数组查询;

public class Test {
	 public static boolean find(int number,int [][] arr) {
		 boolean flag = false;
		 if (arr != null && arr.length !=0) {
			int rows = arr.length;//总行数
			int columns = arr[0].length;//总列数
			int row = 0;//当前行
			int column = columns -1;//当前列
			while (row < rows && column >= 0) {
				if (arr[row][column] == number) {
					flag = true;
					break;
				}else if (arr[row][column] > number) {
					column--;
				}else if (arr[row][column] < number) {
					row++;
				}
			}
		}
		 return flag;
	 }
	 public static void main(String[] args) {
		 int array[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
	     boolean flag = find(6,array);
	     System.out.println(flag);
	}
}
