package cao.test4.��ά�����ѯ;

public class Test {
	 public static boolean find(int number,int [][] arr) {
		 boolean flag = false;
		 if (arr != null && arr.length !=0) {
			int rows = arr.length;//������
			int columns = arr[0].length;//������
			int row = 0;//��ǰ��
			int column = columns -1;//��ǰ��
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
