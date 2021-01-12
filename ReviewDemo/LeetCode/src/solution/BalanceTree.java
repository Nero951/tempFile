package solution;

/**
 * @author: Wade
 * @create: 2021/1/10
 */
public class BalanceTree {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }

        return false;
    }
    public void treeIndex(TreeNode root){
        if(root.left!=null){
            treeIndex(root.left);
        }
        if(root.right!=null){
            treeIndex(root.right);
        }
    }
}
