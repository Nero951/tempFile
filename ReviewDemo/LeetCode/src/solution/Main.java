package solution;

import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/11
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();

            int[] arr = new int[num];
            for(int i = 0; i<num; i++){
                arr[i] = scan.nextInt();
            }
            int x = scan.nextInt();
            System.out.println(ArrayIndex.arrayIndex(arr, x));
//            TreeNode root = new TreeNode(num);
//            BalanceTree b = new BalanceTree();
//            b.isBalance(root);
            //System.out.println(NumAdd.numSquareAdd(num));
        }
    }
}
