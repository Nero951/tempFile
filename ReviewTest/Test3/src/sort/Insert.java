package sort;

public class Insert {
    public void insertSort(int[] arr){
        for (int i=0; i<arr.length-1; i++) {
            int key = arr[i+1];

            int j;
            for (j=i; j>=0 && arr[j]>key; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
    }
}
