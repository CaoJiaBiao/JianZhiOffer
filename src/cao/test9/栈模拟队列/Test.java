package cao.test9.Õ»Ä£Äâ¶ÓÁÐ;

import java.util.Stack;

public class Test {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int value) {
		stack1.push(value);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}else {
			return stack2.pop();			
		}
	}
}
