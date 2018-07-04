package cao.test7.�ؽ�������;

public class Test {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null || pre.length == 0||in.length == 0) {
			return null;
		}
		TreeNode rootNode = new TreeNode(pre[0]);
		rootNode.left = null;
		rootNode.right = null;
		//����������
		int leftnum = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == pre[0]) {
				break;
			}else {
				leftnum++;
			}
		}
		//����������
		int rightnum = pre.length - 1- leftnum;
		// �ؽ�������
		if (leftnum > 0) {
			//����������������
            int[] leftPreOrder = new int[leftnum];
            //����������������
            int[] leftInOrder = new int[leftnum];
            for (int i = 0; i < leftnum; i++) {
				leftPreOrder[i] = pre[i+1];
				leftInOrder[i] = in[i];
			}
            TreeNode leftNode = reConstructBinaryTree(leftPreOrder, leftInOrder);
            rootNode.left = leftNode;
		}
		
		// �ع�������
        if (rightnum > 0) {
            //����������������
            int[] rightPreOrder = new int[rightnum];
            //����������������
            int[] rightInOrder = new int[rightnum];
            for (int i = 0; i < rightnum; i++) {
                rightPreOrder[i] = pre[leftnum + 1 + i];
                rightInOrder[i] = in[leftnum + 1 + i];
            }
            TreeNode rightRoot = reConstructBinaryTree(rightPreOrder, rightInOrder); // �ݹ鹹��������
            rootNode.right = rightRoot;
        }
        return rootNode;
    }
	
}
