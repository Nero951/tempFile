package solution;

import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/18
 */
public class ChangeInHogwarts {
    public static String changeInSchool(String p, String a){
        char[] cp=p.toCharArray();
        char[] ca=a.toCharArray();
        if(cp[0]>ca[0]){
            return "-1";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();
        int x =scan.nextInt();
        int y =scan.nextInt();
        int z =scan.nextInt();
        int m,o,n;
        char d = '.';
        String strP = "a"+d+"b"+d+"c";
        String strA = "x"+d+"y"+d+"z";
        m = a>x? x-a:x-a;
//        o =
    }
}
