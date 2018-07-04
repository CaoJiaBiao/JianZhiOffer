package cao.test6.从头到尾打印链表;

import java.util.Stack;

public class Test栈 {
	public static void print(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		while(listNode != null){
			stack.add(listNode.val);
			//stack.p
			listNode = listNode.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
	}
	public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.val = 1;
        node2.val = 2;
        node3.val = 3;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        // printListReverseByStack(node1); // 调用栈方法
        print(node1); // 调用递归方法
    }
}
