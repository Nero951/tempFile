package sort;


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
//            BubbleSort.bubbleSort(arr);
//            SelectionSort.selectionSort(arr);
//            InsertSort.insertSort(arr);
            ShellSort.shellSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
