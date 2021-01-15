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
            String str = scan.nextLine();
            TreeNode root = new TreeNode(num);
            BalanceTree b = new BalanceTree();
            b.isBalance(root);
            System.out.println(NumAdd.numSquareAdd(num));
        }
    }
}
