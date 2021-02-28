package sort;


import database.HeapSort;

import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = scan.nextInt();
            }
//            BubbleSort.bubbleSort(arr);//冒泡排序
//            SelectionSort.selectionSort(arr);//选择排序
//            InsertSort.insertSort(arr);//插入排序
//            ShellSort.shellSort(arr);//希尔排序
//            System.out.println(Arrays.toString(MergeSort.mergeSort(arr)));//归并排序
//            QuickSort.quickSort(arr);//快速排序
            HeapSort.heapSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
