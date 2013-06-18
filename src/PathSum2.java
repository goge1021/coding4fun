/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PathSum2 {
    
    private int sum;
    private ArrayList<ArrayList<Integer>> ret;
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        this.sum = sum;
        ArrayList<Integer> cur = new ArrayList<Integer>();
        ret = new ArrayList<ArrayList<Integer>>();
        foo(root, 0, cur);
        return ret;
    }
    
    public void foo(TreeNode node, int subSum, ArrayList<Integer> cur){
        if(node == null){
            return ;
        }
        cur.add(node.val);
        if(node.left == null && node.right == null && subSum + node.val == sum){
            ret.add((ArrayList<Integer>)cur.clone());
        }
        foo(node.left, subSum+node.val, cur);
        foo(node.right, subSum+node.val, cur);
        cur.remove(cur.size()-1);
    }
}
