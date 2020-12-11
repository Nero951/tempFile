package solution1;

import java.util.Scanner;

public class solutionMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            int[] train = new int[num];
            for (int i = 0; i<num; i++) {
                train[i] = scan.nextInt();
            }
            trainIntoStation(num, train);
        }
    }
    //TODO 火车进站
    static void trainIntoStation(int num, int[] train){
        if(num<=0 || num>=10){
            return;
        }
        int[] temp = new int[num];
        for (int i = 0; i<num; i++) {
            

        }
    }
    //TODO 二叉树的镜像
}
