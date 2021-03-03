package database;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxLenStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        int tmp = count;
        Map<Integer, Character> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>=0 && str.charAt(i)<=9){
                if(!map.containsValue(str.charAt(i))){
                    map.put(i, str.charAt(i));
                    count++;
                }
            }
            tmp = Math.max(tmp, count);
            count = 0;
        }
        System.out.println(map);
    }
}
