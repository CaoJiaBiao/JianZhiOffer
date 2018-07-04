package cao.test11.旋转数组中的最小数字;

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
		int mid = low; // 这样赋值的原因是：如果将0个元素搬到数组的后面

		/**
		 * 如果能进入此处循环说明当前还是旋转数组
		 */
		while (array[low] >= array[high]) {
			if (high - low == 1) {
				mid = high;
				break;
			}
			mid = (low + high) / 2;
			// 如果low、high、mid三者指向的数字相等，只能顺序查找
			// 因为我们无法判断中间数是属于第一个递增子数组还是属于第二个递增子数组
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
