package cao.test31.栈的压入和弹出序列;

import java.util.Stack;

public class Test {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		Stack<Integer> stack = new Stack<Integer>();
		if ((pushA == null && popA == null) || (pushA.length == 0 && popA.length == 0)) {
			return true;
		}
		if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) {
			return false;
		}
		if (popA.length != pushA.length) {
			return false;
		}
		int j = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while(!stack.isEmpty() && stack.peek() == popA[j]){
				stack.pop();
				j++;
			}
		}
		if (stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
        int [] pushA = {1,2,3,4,5};
        int [] popA = {5,4,3,2,1};

        boolean result = test.IsPopOrder(pushA, popA);
        System.out.println(result);
    }
}
