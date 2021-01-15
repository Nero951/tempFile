package solution;

/**
 * @author: Wade
 * @create: 2021/1/15
 */
public class ArrayIndex {
    public static int arrayIndex(int[] arr, int x){
        int i = 0;
        for( ; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
