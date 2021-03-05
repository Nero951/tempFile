package database;


import sort.Swap;

import java.util.Arrays;

public class Sort {
    public void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    Swap.swap(arr, arr[j], arr[j+1]);
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public void SelectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int tmp = i;
            for (int j = i; j < arr.length; j++){
                if(arr[j]<arr[i]){
                    i = j;
                }
            }
            Swap.swap(arr, i, tmp);
        }
    }

    public void InsertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arr[j]>arr[i]){

                }
            }
        }
    }

    public void QuickSort(int[] arr, int low, int high){
        if (low<high){
            int pivot = partition(arr, low, high);
            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);
        }
    }
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while(low<high){
            while(low<high && arr[high]>=arr[pivot]){
                high--;
            }
            arr[low] = arr[high];
            while(low<high && arr[low]<=arr[pivot]){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    public int[] MergeSort(int[] arr){
        if(arr.length<2) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length-1);
        return merge(MergeSort(left), MergeSort(right));
    }

    private int[] merge(int[] left, int[] right){
        int[] arr = new int[left.length+right.length];
        for(int index = 0, i = 0, j = 0; index<arr.length; index++){
            if(i>left.length){
                arr[index] = right[j++];
            }else if(j>right.length){
                arr[index] = left[i++];
            }else if(left[i]>right[j]){
                arr[index] = right[j++];
            }else{
                arr[index] = left[i++];
            }
        }
        return arr;
    }


}
