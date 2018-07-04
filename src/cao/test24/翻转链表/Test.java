package cao.test24.·­×ªÁ´±í;

public class Test {
	public ListNode ReverseList(ListNode head) {
		ListNode pReverseNode = null;
		ListNode pNode = head;
		ListNode pPre = null;
		while(pNode != null){
			ListNode nextNode = pNode.next;
			if (nextNode == null) {
				pReverseNode = pNode;
			}
			pNode.next = pPre;
			pPre = pNode;
			pNode = nextNode;
		}
		return pReverseNode;
	}
}
