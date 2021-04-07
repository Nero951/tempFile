package Test;

import java.util.Scanner;

class Outer{
    int a = 5;
    static int b = 10;
     public Outer(){

     }
     static class Inner{
         public Inner() {
//             System.out.println(a);
             System.out.println(b);
         }
     }
}
public class Main {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            System.out.println(hammingWeight(n));
        }
    }
}
