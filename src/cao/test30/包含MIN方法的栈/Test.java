package cao.test30.包含MIN方法的栈;

import java.util.Stack;

public class Test {
	
	Stack<Integer> dataStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	int minValue = 0;
	public void push(int node) {
		dataStack.push(node);
		if (minStack.isEmpty()) {
			minValue = node;
		}else {
			if (minValue > node) {
				minValue = node;
			}
		}
		minStack.push(minValue);
	}

	public void pop() {
		if (!dataStack.isEmpty() && !minStack.isEmpty()) {
			dataStack.pop();
			minStack.pop();
			if (!minStack.isEmpty()) {
				minValue = minStack.peek();
			}else {
				minValue = 0;
			}
		}
	}

	public int top() {
		if (!dataStack.isEmpty()) {
			return dataStack.peek();
		}
		return 0;
	}

	public int min() {
		return minValue;
	}
}
