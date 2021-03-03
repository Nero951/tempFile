package database;


import sort.Swap;

public class HeapSort {
    public static void heapSort(int[] arr){
        for (int i = arr.length/2; i >= 0; i--) {
            heapAdjust(arr, i, arr.length);//将数组调整为一个大根堆
        }
        for (int i = arr.length-1; i > 0; i--) {
            Swap.swap(arr, 0, i);
            heapAdjust(arr, 0, i);
        }
    }

    private static void heapAdjust(int[] arr, int i, int length) {
        int max = i;
        int leftChild = i*2;
        int rightChild = i*2+1;
        if(length>leftChild && arr[max]<arr[leftChild]) max = leftChild;
        if (length > rightChild && arr[max] < arr[rightChild]) max=rightChild;

        if(max != i){
            Swap.swap(arr, i, max);
            heapAdjust(arr, max, length);
        }

    }

}
