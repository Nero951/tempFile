package sort;


public class QuickSort {

    public static void quickSort(int[] arr){
        if(arr.length<2){
            return;
        }
        int low = 0;
        int high = arr.length-1;
        quick(arr, low, high);
    }

    private static void quick(int[] arr, int low, int high) {
        if(low<high){
            int pivot = partition(arr, low, high);
            quick(arr, low, pivot-1);
            quick(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while(low<high){
            while (low<high && arr[high]>=pivot){
                --high;
            }
            arr[low] = arr[high];
            while (low<high && arr[low]<=pivot){
                ++low;
            }
            arr[high]=arr[low];
        }
        arr[low] = pivot;
        return low;
    }
}
