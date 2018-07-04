package cao.test25.合并排序的链表;

public class Test {
	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		ListNode pListNode = null;
		if (list1.val < list2.val) {
			pListNode = list1;
			pListNode.next = Merge(list1.next, list2);
		}
		else {
			pListNode = list2;
			pListNode.next = Merge(list1, list2.next);
		}
		return pListNode;
	}
}
