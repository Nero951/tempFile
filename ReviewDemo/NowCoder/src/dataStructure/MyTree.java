package dataStructure;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class MyTree {
    public void preTraverse(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        preTraverse(root.left);
        preTraverse(root.right);
    }
    public void midTraverse(TreeNode root){
        if(root == null) return;
        midTraverse(root.left);
        System.out.println(root.val);
        midTraverse(root.right);
    }
    public void lastTraverse(TreeNode root){
        if(root == null) return;
        lastTraverse(root.left);
        lastTraverse(root.right);
        System.out.println(root.val);
    }

}
