package cao.test6.从头到尾打印链表;

import java.util.ArrayList;

public class Test递归 {
	public void demo(ArrayList<Integer> result,ListNode listNode) {
		if (listNode == null) {
			return ;
		}else {
			demo(result, listNode.next);
			result.add(listNode.val);
			return ;
		}
	}
	//牛客
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		demo(result, listNode);
		return result;
	}
}
