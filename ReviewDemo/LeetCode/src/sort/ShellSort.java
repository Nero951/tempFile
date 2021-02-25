package sort;


public class ShellSort {
    public static void shellSort(int[] arr){
        if(arr.length>0){
            int gap = arr.length/2;
            while (gap>0) {
                for(int i=gap; i<arr.length; i++){
                    int tmp = i-gap;
                    if(tmp>=0 && arr[i]<arr[tmp]){
                        Swap.swap(arr, i, tmp);
                    }
                }
                gap/=2;
            }
        }
    }
}
