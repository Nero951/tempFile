package solution1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int m = scan.nextInt();
            System.out.println(GetSequeOddNum(m));
        }
    }
    public static String GetSequeOddNum(int m){
        if(m==0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int sum = m*m+1-m;
        for(int i = 0; i<m; i++){
            sb.append(sum+2*i);
            sb.append("+");
        }
        sb.replace(sb.length()-1,sb.length()," ");
        return sb.toString();
    }
}
