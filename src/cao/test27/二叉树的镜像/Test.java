package cao.test27.¶þ²æÊ÷µÄ¾µÏñ;

public class Test {
	public void Mirror(TreeNode root) {
		if(root == null)
			return;
		if (root.left == null && root.right == null) {
			return;
		}
		TreeNode tempNode = null;
		tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		if (root.left != null) {
			Mirror(root.left);
		}
		if (root.right != null) {
			Mirror(root.right);
		}
	}
}
