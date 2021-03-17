package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Wade
 * @create: 2021/1/11
 */
public class Main {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNext()){
//            int num = scan.nextInt();
//            for(int i=0; i<num; i++){
//                char j =scan.next().charAt(0);
//                char y =scan.next().charAt(0);
//
//            }
//            System.out.println(Mora.gameStart(num, j, y));
//            System.out.println(CountTwo.countNumberOf2s(num));
//            int[] arr = new int[num];
//            for(int i = 0; i<num; i++){
//                arr[i] = scan.nextInt();
//            }
//            int x = scan.nextInt();
//            System.out.println(ArrayIndex.arrayIndex(arr, x));
//            TreeNode root = new TreeNode(num);.
//            BalanceTree b = new BalanceTree();
//            b.isBalance(root);
            //System.out.println(NumAdd.numSquareAdd(num));
        System.out.println(brokenCount(3, 10));
//        }
    }
    public static int brokenCount(int X, int Y){
        int count = 0;
        while(Y>X){
            X=X<<1;
            count++;
        }
        while(X>Y){
            X-=1;
            count++;
        }
        return count;
    }

    public int countStep(int val, int[] arr){
        if(arr.length == 0 || val == 0) return 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
//            if(list!=null && list.contains(arr[i])){
//
//            }
            if(map != null && map.containsValue(arr[i])){
                
            }
            list.add(arr[i]);
            count++;
        }
        return 0;
    }


}
