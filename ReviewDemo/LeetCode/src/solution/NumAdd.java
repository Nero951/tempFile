package solution;

/**
 * @author: Wade
 * @create: 2021/1/13
 */
public class NumAdd {
    public static int numAdd(int num){
        int sum = 0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static String numSquareAdd(int num){
        return numAdd(num)+" "+numAdd(num*num);
    }
}
