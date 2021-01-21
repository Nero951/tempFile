package solution;

import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/19
 */
public class GoUpstairs {
    public static int countWays(int n){
        if(n==0||n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-3]+dp[i-2]+dp[i-1])%1000000007;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            System.out.println(countWays(scan.nextInt()));
        }
    }
}
