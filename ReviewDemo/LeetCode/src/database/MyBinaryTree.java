package database;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val = val;
    }
}
public class MyBinaryTree {

    public void preTraversal(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        preTraversal(root.left);
        preTraversal(root.right);
    }

    public void midTraversal(TreeNode root){
        if(root == null) return;
        preTraversal(root.left);
        System.out.println(root.val);
        preTraversal(root.right);
    }

    public void lastTraversal(TreeNode root){
        if(root == null) return;
        preTraversal(root.left);
        preTraversal(root.right);
        System.out.println(root.val);
    }
}
