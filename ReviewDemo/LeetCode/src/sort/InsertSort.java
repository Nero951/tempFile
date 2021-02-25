package sort;


public class InsertSort {
    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else break;
            }
            arr[j+1]=tmp;
        }
    }

}
