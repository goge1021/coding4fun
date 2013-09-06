
public class BinaryTreeMaximumPathSum {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public int foo(TreeNode node){
		if(node == null){
			return 0;
		} else {
			int left = foo(node.left);
			int right = foo(node.right);
			int tmp = Math.max(node.val, node.val+left);
			tmp = Math.max(tmp, node.val+right);
			max = Math.max(max, tmp);
			max = Math.max(max, left+node.val+right);
			return tmp;
		}
	}
	
	public int max;
	public int maxPathSum(TreeNode root){
		max = Integer.MIN_VALUE;
		foo(root);
		return max;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		BinaryTreeMaximumPathSum b = new BinaryTreeMaximumPathSum();
		System.out.println(b.maxPathSum(root));
	}

}
