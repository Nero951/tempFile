package solution1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class MyTreeNode{
    int val;
    MyTreeNode left;
    MyTreeNode right;

    public MyTreeNode(int val, MyTreeNode left, MyTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class solutionMain {
    public String name = "abc";
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        solutionMain test = new solutionMain();
        solutionMain testB = new solutionMain();
        System.out.println(test.equals(testB)+" , "+test.name.equals(testB.name));
//        while(scan.hasNext()){
//            list.clear();
//            int num = scan.nextInt();
//            int[] train = new int[num];
//            Stack<Integer> stack = new Stack<>();
//            for (int i = 0; i<num; i++) {
//                train[i] = scan.nextInt();
//            }
//            trainIntoStation(train, 0, stack, " ", 0);
//            Collections.sort(list);
//            for (String str: list){
//                System.out.println(str);
//            }
//        }
    }
    //TODO 火车进站
    static void trainIntoStation(int[] train, int i, Stack<Integer> stack, String str, int n){
        if(n==train.length){
            list.add(str);
        }
        if(!stack.isEmpty()){
            int temp = stack.pop();
            trainIntoStation(train, i, stack, str+temp+" ", n+1);
            stack.push(temp);
        }
        if(i<train.length){
            stack.push(train[i]);
            trainIntoStation(train, i+1, stack, str, n);
            stack.pop();
        }

    }
    //TODO 二叉树的镜像
    static void Mirror(MyTreeNode root){
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        MyTreeNode tmpRoot = root.left;
        root.left = root.right;
        root.right = tmpRoot;
        if (root.left != null)
            Mirror(root.left);
        if (root.right != null)
            Mirror(root.right);
    }
}
