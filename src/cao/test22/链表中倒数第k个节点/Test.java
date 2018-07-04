package cao.test22.链表中倒数第k个节点;

public class Test {
	public ListNode FindKthToTail(ListNode head, int k) {
		if(head == null || k == 0){
			return null;
		}
		ListNode ahead = head;
		for (int i = 0; i < k-1; i++) {
			if (ahead.next != null) {
				ahead = ahead.next;
			}else {
				return null;
			}
		}
		ListNode behind = head;
		while(ahead.next != null){
			ahead = ahead.next;
			behind = behind.next;
		}
		return behind;
	}
}
