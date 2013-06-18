public class PathSum {
  
	private int sum;
    
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        this.sum = sum;
        return foo(root, 0);
    }
    
    public boolean foo(TreeNode node, int subSum){
        if(node == null){
            return false;
        }
        if(node.left == null && node.right == null){
            if(subSum + node.val == sum){
                return true;
            }
            else {
                return false;
            }
        } else if(node.left == null) {
            return foo(node.right, subSum+node.val);
        } else if(node.right == null) {
            return foo(node.left, subSum+node.val);
        } else {
            return foo(node.right, subSum+node.val) || foo(node.left, subSum+node.val);
        }
    }

}
