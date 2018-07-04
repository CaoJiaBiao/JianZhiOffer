package cao.test21.��������˳��ʹ��������ż��ǰ��;

public class Test {
	public void reOrderArray(int[] array) {
		if (array.length == 0 || array == null) {
			return;
		}
		int pBegin = 0;
		int pEnd = array.length - 1;
		while(pBegin < pEnd){
			while(pBegin < pEnd && (array[pBegin] & 1) != 0){
				pBegin++;
			}
			while(pBegin < pEnd &&(array[pEnd] & 1) == 0){
				pEnd--;
			}
			if (pBegin < pEnd) {
				int temp = array[pBegin];
				array[pBegin] = array[pEnd];
				array[pEnd] = temp;
			}
		}
	}
}
