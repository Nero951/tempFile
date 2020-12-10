package solution1;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int[] arr = new int[10];
            for (int i = 0; i<arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            int sum = 0;
            for (int i : arr) {
                sum+=arr[i];
            }
            System.out.println(minNumber(arr, sum));
        }
    }
    public static String minNumber(int[] arr, int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = null;

        for (int i = 0; i<arr.length; i++) {
            if(arr[i]!=0){
                for(int j = 0; j<i; j++){
                    stringBuilder.append(i);
                }
            }
        }

        //Arrays.sort(stringBuilder.toString().toCharArray());
//        if(array[0]==0){
//            for(int i = 1; i<array.length-1; i++){
//                if(array[i]>array[0]){
//                    int tmp = array[0];
//                    array[0] = array[i];
//                    array[i] = tmp;
//                    break;
//                }
//            }
//        }
//        for (int value : array) {
//            sb.append(value);
//        }
        return stringBuilder.toString();
    }
}
