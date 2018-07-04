package cao.test11.��ת�����е���С����;

public class Test {
	public int minInOrder(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public int minNumberInRotateArray(int[] array) {
		if (array == null || array.length == 0) {
			return -1;
		}

		int low = 0;
		int high = array.length - 1;
		int mid = low; // ������ֵ��ԭ���ǣ������0��Ԫ�ذᵽ����ĺ���

		/**
		 * ����ܽ���˴�ѭ��˵����ǰ������ת����
		 */
		while (array[low] >= array[high]) {
			if (high - low == 1) {
				mid = high;
				break;
			}
			mid = (low + high) / 2;
			// ���low��high��mid����ָ���������ȣ�ֻ��˳�����
			// ��Ϊ�����޷��ж��м��������ڵ�һ�����������黹�����ڵڶ�������������
			if (array[low] == array[mid] && array[high] == array[mid]) {
				return minInOrder(array);
			}

			if (array[mid] >= array[low]) {
				low = mid;
			} else if (array[mid] <= array[high]) {
				high = mid;
			}
		}
		return array[mid];
	}
}
