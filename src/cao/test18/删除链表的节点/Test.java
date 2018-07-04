package cao.test18.删除链表的节点;

public class Test {
	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null) {
			return null;
		}
		ListNode preNode = new ListNode(0);
		ListNode tmpListNode = preNode;
		preNode.next = pHead;
		ListNode nowNode = pHead;
		while (nowNode != null) {
			if (nowNode.next != null && nowNode.val == nowNode.next.val) {
				while (nowNode.next != null && nowNode.val == nowNode.next.val) {
					nowNode = nowNode.next;
				}
				preNode.next = nowNode.next;
			} else {

				preNode = nowNode;
			}
			nowNode = nowNode.next;

		}
		return tmpListNode.next;
	}
	public static void main(String[] args) {
		ListNode listNode1= new ListNode(1);
		ListNode listNode2;
		ListNode headListNode = new ListNode(3);
		listNode2 = listNode1;
		listNode2.val = 4;
		System.out.println(listNode1.val);
		
	}
}
