package cao.test6.��ͷ��β��ӡ����;

import java.util.Stack;

public class Testջ {
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

        // printListReverseByStack(node1); // ����ջ����
        print(node1); // ���õݹ鷽��
    }
}
