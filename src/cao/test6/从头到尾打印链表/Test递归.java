package cao.test6.��ͷ��β��ӡ����;

import java.util.ArrayList;

public class Test�ݹ� {
	public void demo(ArrayList<Integer> result,ListNode listNode) {
		if (listNode == null) {
			return ;
		}else {
			demo(result, listNode.next);
			result.add(listNode.val);
			return ;
		}
	}
	//ţ��
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		demo(result, listNode);
		return result;
	}
}
