package solution;

/**
 * @author: Wade
 * @create: 2021/1/22
 */
public class ArrayMid {
    public int[] arrayMerge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length+1];
        while(arr1!=null && arr2!=null){
            int i = 0;
            if(arr1[i]<arr2[i]){
                arr[i]=arr1[i];
            }
        }
        return arr;

    }
}
