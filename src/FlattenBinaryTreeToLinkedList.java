
public class FlattenBinaryTreeToLinkedList {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public TreeNode foo(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode l_tail = foo(node.left);
        TreeNode r_tail = foo(node.right);
        if(l_tail != null){
            l_tail.right = node.right;
            node.right = node.left;
            node.left = null;
            if(r_tail != null){
                return r_tail;
            } else {
                return l_tail;
            }
        } else if(r_tail != null){
            return r_tail;
        } else {
            return node;
        }
        
    }
    public void flatten(TreeNode root) {
        foo(root);
    }
}
