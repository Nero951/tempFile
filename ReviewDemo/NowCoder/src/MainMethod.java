import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        while(scan.hasNext()){
//
//        }
        int[] a = {38, 65, 67, 125};
        int[] b = {78, 89, 129};
//        System.out.println(Arrays.toString(mergePrice(a, b)));
        String str = new String("abcddcef");
        System.out.println(longestPalindrom(str));
    }
    public static int[] mergePrice (int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        int iA=0, iB=0;
        int j = 0;
        int[] tmp = new int[lenA+lenB];
        while(lenA>0 && lenB>0){
            if(a[iA]<=b[iB]){
                tmp[j++] = a[iA];
                iA++;
                lenA--;
            }else{
                tmp[j++] = b[iB];
                iB++;
                lenB--;
            }
        }
        while(lenA==0 && lenB>0){
            tmp[j++] = b[iB++];
            lenB--;
        }
        while(lenB==0 && lenA != 0){
            tmp[j++] = a[iA++];
            lenA--;
        }
        return tmp;
    }

    public static String longestPalindrom (String string) {
//        char[] chr = string.toCharArray();
        int right = string.length()-1;
        Map<Integer, String> map = new HashMap<>();
        int count = 0;
        int tmp = 0;
        for(;right > 0; right--){
            for(int left = 0;left < string.length(); left++){
                if(isPalindrom(string.substring(left, right))){
                    String str = new String(string.substring(left, right));
                    map.put(str.length(), str);
                    tmp = str.length();
                    count = Math.max(count, tmp);
                }
            }
        }
        return map.get(count);
    }
    public static boolean isPalindrom(String string){
        int left = 0, right = string.length()-1;
        while(left<right){
            if(string.charAt(left)!=string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
