package cao.test7.重建二叉树;

public class Test {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null || pre.length == 0||in.length == 0) {
			return null;
		}
		TreeNode rootNode = new TreeNode(pre[0]);
		rootNode.left = null;
		rootNode.right = null;
		//左子树个数
		int leftnum = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == pre[0]) {
				break;
			}else {
				leftnum++;
			}
		}
		//右子树个数
		int rightnum = pre.length - 1- leftnum;
		// 重建左子树
		if (leftnum > 0) {
			//左子树的先序序列
            int[] leftPreOrder = new int[leftnum];
            //左子树的中序序列
            int[] leftInOrder = new int[leftnum];
            for (int i = 0; i < leftnum; i++) {
				leftPreOrder[i] = pre[i+1];
				leftInOrder[i] = in[i];
			}
            TreeNode leftNode = reConstructBinaryTree(leftPreOrder, leftInOrder);
            rootNode.left = leftNode;
		}
		
		// 重构右子树
        if (rightnum > 0) {
            //右子树的先序序列
            int[] rightPreOrder = new int[rightnum];
            //右子树的中序序列
            int[] rightInOrder = new int[rightnum];
            for (int i = 0; i < rightnum; i++) {
                rightPreOrder[i] = pre[leftnum + 1 + i];
                rightInOrder[i] = in[leftnum + 1 + i];
            }
            TreeNode rightRoot = reConstructBinaryTree(rightPreOrder, rightInOrder); // 递归构建右子树
            rootNode.right = rightRoot;
        }
        return rootNode;
    }
	
}
