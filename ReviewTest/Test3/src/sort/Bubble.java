package sort;

public class Bubble {
    public void bubbleSort(int[] arr){
        for (int i=0; i<arr.length-i; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    Math.swap(arr[j],arr[j+1]);
                }
            }
        }
    }
}
