package cao.test29.˳ʱ���ӡ����;

import java.util.ArrayList;

public class Test {
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix == null) {
			return null;
		}
		int rows = matrix.length;
		int columns = matrix[0].length;
		if (columns <= 0 || rows <=0) {
			return null;
		}
		ArrayList<Integer> reArrayList = new ArrayList<Integer>();
		int start = 0;
		while(columns > start*2 && rows > start*2){
			printMatrixInCircle(reArrayList,matrix,start);
			++start;
		}
		return reArrayList;
	}

	private static void printMatrixInCircle(ArrayList<Integer> reArrayLists,int[][] matrix, int start) {
		// TODO Auto-generated method stub
		int endX = matrix[0].length - 1- start;
		int endY = matrix.length - 1 - start;
		//��������
		for (int i = start; i <= endX; i++) {
			reArrayLists.add(matrix[start][i]);
		}
		//���ϵ���
		if (start < endY) {
			for (int i = start + 1; i <= endY; i++) {
				reArrayLists.add(matrix[i][endX]);
			}
		}
		//���ҵ���
		if (start < endX && start < endY) {
			for (int i = endX - 1; i >= start; i--) {
				reArrayLists.add(matrix[endY][i]);
			}
		}
		//���µ���
		if (start < endX && start < endY -1) {
			for (int i = endY - 1; i >= start +1; i--) {
				reArrayLists.add(matrix[i][start]);
			}
		}
	}
	public static void main(String[] args) {
		int [][] a = {{1},{2},{3},{4},{5}};
		ArrayList<Integer> bArrayList = printMatrix(a);
		System.out.println(bArrayList);
	}
}
