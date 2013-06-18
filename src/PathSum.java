public class PathSum {
  
    private int sum;
    
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        this.sum = sum;
        return foo(root, 0);
    }
    
    public boolean foo(TreeNode node, int subSum){
        //It is the point that we do not need to judge whether node.left or node right is null or not
        if(node == null){
            return false;
        }
        if(node.left == null && node.right == null && subSum + node.val == sum){
            return true;
        }
       
        return foo(node.right, subSum+node.val) || foo(node.left, subSum+node.val);
    }

}
