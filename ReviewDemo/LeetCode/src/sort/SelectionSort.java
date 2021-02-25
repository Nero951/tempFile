package sort;

/**
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j =i; j<arr.length; j++){
                if(arr[i]>arr[j]){
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
                    Swap.swap(arr, i, j);
                }
            }
        }
    }
}
