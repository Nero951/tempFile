package dataStructure;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int calcSimilarity(String name1, String name2) {
        if(name1 == null || name2 == null) return 0;
        StringBuilder nameChar = new StringBuilder();
        int n1 = name1.length();
        int n2 = name2.length();
        int i = 0;
        if(n1>=n2){
            for (; i < name2.length(); i++) {
                if(!(name1.charAt(i)==name2.charAt(i))) {
                    nameChar.append(name1.charAt(i));
                    nameChar.append(name2.charAt(i));
                }
            }
            nameChar.append(name1.substring(i));
        }else {
            for (; i < name1.length(); i++) {
                if(!(name1.charAt(i)==name2.charAt(i))) {
                    nameChar.append(name1.charAt(i));
                    nameChar.append(name2.charAt(i));
                }
            }
           nameChar.append(name2.substring(i));
        }
        name1 = nameChar.toString().replace(" ", "");
        int sum = 0;
        for (char value : name1.toCharArray()) {
            sum += value;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
//            String name1 = in.nextLine();
//            String name2 = in.nextLine();
//
//            int sum = calcSimilarity(name1, name2);
//            System.out.println(sum);
            int count = in.nextInt();
            int num = in.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(countNum(arr, count));
        }
    }

    public static String convert(String s, int numRows){
        if (numRows == 1) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < Math.min(numRows, s.length()); i++){
            rows.add(new StringBuilder());
        }
        int curRow = 0;
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows-1) goingDown = !goingDown;
            curRow+=goingDown? 1 : -1;
        }
        StringBuilder ret = new StringBuilder();
        for(StringBuilder row : rows){
            ret.append(row);
        }
        return ret.toString();
    }

    public static String convert1(String s, int numRows){
        if(numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2*numRows-2;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j+i < n; j++){
                ret.append(s.charAt(j+i));
                if(i != 0 && i != numRows-1 && j+cycleLen-i < n)
                    ret.append(s.charAt(j+cycleLen-i));
            }
        }
        return ret.toString();
    }

    public static char countNum(int[] arr, int num){
        StringBuilder tempStr = new StringBuilder();
        for (int k : arr) {
            tempStr.append(k);
            int count = 0;
            for (int j = 0; j < tempStr.length(); j++) {
                count++;
                if (count == num) {
                    return tempStr.charAt(j);
                }
            }
        }
        return 0;
    }

    public static int reverseNum(int num){
        int tmp = 0;
        while(num!=0){
            int pop = num%10;
            num/=10;
            if(tmp > Integer.MAX_VALUE/10 || (tmp == Integer.MAX_VALUE/10 && pop > 7)) return 0;
            if(tmp < Integer.MIN_VALUE/10 || (tmp == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            tmp = tmp*10+pop;
        }
        return tmp;
    }

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str = String.valueOf(x);
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        for(int i = 0; i < str.length(); i++){
            if(stack.pop()!=str.charAt(i)) return false;
        }
        return true;
    }
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            nums[i] = start+2*i;
            sum = sum^nums[i];
        }
        return sum;
    }
}
