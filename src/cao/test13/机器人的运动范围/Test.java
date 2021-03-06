package cao.test13.机器人的运动范围;

public class Test {

	public int getDigitSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public boolean check(int threshold, int rows, int cols, int row, int col,
			boolean[] visited) {
		if (row >= 0 && col >= 0 && row < rows && col < cols
				&& getDigitSum(col) + getDigitSum(row) <= threshold
				&& !visited[row * cols + col]) {
			return true;
		}
		return false;
	}

	private int movingCountCore(int threshold, int rows, int cols, int row,
			int col, boolean[] visited) {
		// TODO Auto-generated method stub
		int count = 0;
		if (check(threshold, rows, cols, row, col, visited)) {
			visited[row * cols + col] = true;
			count = 1
					+ movingCountCore(threshold, rows, cols, row + 1, col,
							visited)
					+ movingCountCore(threshold, rows, cols, row - 1, col,
							visited)
					+ movingCountCore(threshold, rows, cols, row, col + 1,
							visited)
					+ movingCountCore(threshold, rows, cols, row, col - 1,
							visited);
		}
		return count;
	}

	// 主调函数
	public int movingCount(int threshold, int rows, int cols) {
		if (threshold < 0 || rows < 1 || cols < 1) {
			return 0;
		}
		boolean[] visited = new boolean[rows * cols];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		int count = movingCountCore(threshold, rows, cols, 0, 0, visited);
		return count;
	}

}
