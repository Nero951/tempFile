package solution;

import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/19
 */
public class Mora {
    public static void main(String[] args){
        int jb=0,jc=0,jj=0;
        int yb=0,yc=0,yj=0;
        int[] score = new int[3];
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                char j = scan.next().charAt(0);
                char y = scan.next().charAt(0);
                if (j == 'C') {
                    if (y == 'C') {
                        score[1]++;
                    } else if (y == 'J') {
                        score[0]++;
                        jc++;
                    } else {
                        score[2]++;
                        yb++;
                    }
                } else if (j == 'J') {
                    if (y == 'C') {
                        score[2]++;
                        yc++;
                    } else if (y == 'J') {
                        score[1]++;
                    } else {
                        score[0]++;
                        jj++;
                    }
                } else {
                    if (y == 'C') {
                        score[0]++;
                        jb++;
                    } else if (y == 'J') {
                        score[2]++;
                        yj++;
                    } else {
                        score[1]++;
                    }
                }
            }
            System.out.println(score[0]+" "+score[1]+" "+score[2]);
            System.out.println(score[2]+" "+score[1]+" "+score[0]);
            int Jmax = jb;
            char Jans = 'B';
            if(Jmax < jc) {
                Jmax = jc;
                Jans = 'C';
            }
            if(Jmax < jj) {
                Jans = 'J';
            }
            System.out.print(Jans + " ");

            int Ymax = yb;
            char Yans = 'B';
            if(Ymax < yc) {
                Ymax = yc;
                Yans = 'C';
            }
            if(Ymax < yj) {
                Yans = 'J';
            }
            System.out.print(Yans);

        }
    }
}
