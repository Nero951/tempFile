package solution;

import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/19
 */
public class MainChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        String[] strP = str[0].split("[.]");
        String[] strA = str[1].split("[.]");
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(strP[i]);
            b[i] = Integer.parseInt(strA[i]);
        }
        int P = a[0]*17*29+a[1]*29+a[2];
        int A = b[0]*17*29+b[1]*29+b[2];
        int change = A-P;
        int x = Math.abs(change%29);
        int y = Math.abs(change/29%17);
        int z = change/29/17;
        System.out.println(z+"."+y+"."+x);
    }
}
