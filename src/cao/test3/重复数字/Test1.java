package cao.test3.ÖØ¸´Êı×Ö;

public class Test1 {
	
	private static int duplication;
	private static boolean duplicate(int[] arr) {
		// TODO Auto-generated method stub
		if (arr == null || arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] >= arr.length) {
				return false;
			}
		}
		//System.out.println("---");
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i) {
				if (arr[i] == arr[arr[i]]) {
					duplication = arr[i];
					System.out.println(arr[i]);
					return true;
				}
				
				int temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {0,3,1,3,2,5,6};
		boolean result = duplicate(arr);
		System.out.println(result);
	}

}
