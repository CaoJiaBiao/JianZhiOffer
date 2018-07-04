package cao.test23.链表中环的入口节点;

public class Test {
	public ListNode meetingNode(ListNode head){
		if (head == null) {
			return null;
		}
		ListNode behind  = head.next;
		if (behind == null) {
			return null;
		}
		ListNode ahead = behind.next;
		while(ahead != null && behind != null){
			if (ahead == behind) {
				return ahead;
			}
			ahead = ahead.next;
			behind = behind.next;
			if (ahead != null) {
				ahead = ahead.next;
			}
		}
		return null;
	}
	public ListNode EntryNodeOfLoop(ListNode head) {
		if(head == null)
			return null;
		ListNode meetListNode = meetingNode(head);
		if (meetListNode == null) {
			return null;
		}
		ListNode listNode1 = meetListNode;
		int bidesInLoop = 1;
		while(listNode1.next != meetListNode){
			listNode1 = listNode1.next;
			++bidesInLoop;
		}
		listNode1 = head;
		for (int i = 0; i < bidesInLoop; i++) {
			listNode1 = listNode1.next;
		}
		ListNode listNode2 = head;
		while(listNode1 != listNode2){
			listNode1 = listNode1.next;
			listNode2 = listNode2.next;
		}
		return listNode1;
	}
}
