package solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
//            int num = scan.nextInt();
//            if(num == 0){
//                return;
//            }
//            int[] scoreArr = new int[num];
//            for (int i = 0; i<num ; i++) {
//                scoreArr[i] = scan.nextInt();
//            }
//            int score = scan.nextInt();
//            System.out.print(sameScore(num, scoreArr, score)+" ");
            int t = scan.nextInt();
            int num = scan.nextInt();
            int k = scan.nextInt();
            ArrayList<Integer> cardList = new ArrayList<>();
            for (int i = 0; i<t; i++) {
                for (int j = 0; j<2*num; j++) {
                    cardList.add(scan.nextInt());
                }
            }
            System.out.println(wishDuck(num, k, cardList));
        }
    }
    //TODO 洗牌
    public static String wishDuck(int n, int k, ArrayList<Integer> cardList){
        if(cardList.size()<2){
            return cardList.toString();
        }
        Collections.reverse(cardList);
        for (int i = 0; i<k; i++) {
            ArrayList<Integer> card1 = new ArrayList<>();
            ArrayList<Integer> card2 = new ArrayList<>();
            for(int j = 0; j<n; j++){
                card1.add(cardList.get(j));
            }
            for(int j = n; j<2*n; j++){
                card2.add(cardList.get(j));
            }
            cardList.clear();
            for(int j = 0; j<n; j++){
                cardList.add(card1.get(j));
                cardList.add(card2.get(j));
            }
        }
        return cardList.toString()
                .replace("["," ")
                .replace("]"," ")
                .replace(","," ");
    }
    //TODO 统计同成绩学生人数
    public static int sameScore(int num, int[] scoreArr, int score){
        if(scoreArr.length==0){
            return -1;
        }
        int count = 0;
        for(int i = 0; i<num; i++){
            if(scoreArr[i]==score){
                count++;
            }
        }
        return count;
    }
}
