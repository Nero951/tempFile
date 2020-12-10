package solution1;

import java.util.Scanner;

public class UnusualAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=0, b=0;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(addAB(a, b));
    }
    //TODO 饥饿的小易
    public static int hungry(long x){
        
        return 0;
    }

    public static int addAB(int A, int B) {
        while (B!=0) {
            int temp = A^B;
            B = (A&B)<<1;
            A = temp;
        }
        return A;
    }
}
