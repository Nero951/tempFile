package database;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(readNumber(n, arr));
        }
    }

    private static int readNumber(int n, int[] arr) {
        if (n<=0){
            return -1;
        }
        for (int i=0; i<n; i++){
            if(arr[i]>=n || arr[i]<0){
                return -1;
            }
            if(arr[i]!=i){
                if(arr[arr[i]]!=arr[i]){
                    swap(arr[i], arr[arr[i]]);
                }else {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    private static void swap(int i, int i1) {
        int tmp = i;
        i = i1;
        i1 = tmp;
    }

}
