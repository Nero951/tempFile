package solution;

import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/19
 */
public class GoUpstairs {
    public int countWays(int n){
        if(n==0)
        return 0;
    }

    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            System.out.println(countWays(scan.nextInt()));
        }
    }
}
