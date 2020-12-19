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
//        int[] arr = {1,1,2,3,7,7,7,9,9,10};
//        System.out.println(upper_bound_(n, v, arr));
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int v = scan.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[v];
            for(int i = 0; i<n; i++){
                arr1[i] = scan.nextInt();
            }
            for(int i = 0; i<v; i++){
                arr2[i] = scan.nextInt();
            }
            System.out.println(findMedianSortedArrays(arr1, arr2));
        }
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
    //二分查找
    static int upper_bound_ (int n, int v, int[] a) {
        int left = 0;
        int right = n-1;
        int mid = (left+right)/2;
        while(left<=right){
            if(mid>0 && a[mid-1]>=v){
                right = mid-1;
                mid = (left+right)/2;
            }else if(a[mid]<v){
                left = mid+1;
                mid = (left+right)/2;
            }else{
                return mid+1;
            }
        }
        return n;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length]; 
        int n = 0;
        for (int item : nums1) {
            for (int value : nums2) {
                if (item <= value) {
                    nums[n] = item;
                    n++;
                    break;
                } else {
                    nums[n] = value;
                    n++;
                }
            }
        }
        return nums.length%2==1? nums[(nums.length-1)/2] :
                (nums[(nums.length)/2]+nums[(nums.length-1)/2])/2;
    }
}
