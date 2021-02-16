package database;


import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
//            int n = scan.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i<n; i++){
//                arr[i] = scan.nextInt();
//            }
//            System.out.println(readNumber(n, arr));
            String s = scan.next();
            System.out.println(lengthOfLongestSubstring(s));
        }
    }

    private static int readNumber(int n, int[] arr) {
        if (n<=0){
            return -1;
        }
        for (int i=0; i<n; i++){
            if(arr[i]>=n || arr[i]<0){
                return -1;
            }
            if(arr[i]!=i){
                if(arr[arr[i]]!=arr[i]){
                    swap(arr, arr[i], arr[arr[i]]);
                }else {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    private static int[] swap(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
        return arr;
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            int n = target-nums[i];
            for (int j=i+1; j<nums.length; j++){
                if(nums[j]==n){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count =0;
        ListNode head = null, tail = null;
        while(l1!=null || l2!=null){
            int n = l1==null? 0 : l1.val;
            int m = l2==null? 0 : l2.val;
            int a = m+n+count;
            if(head==null){
                head=tail=new ListNode(a%10);
            }else {
                tail.next=new ListNode(a%10);
                tail=tail.next;
            }
            count=a/10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if(count>0){
            tail.next=new ListNode(count);
        }
        return head;
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(set.add(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                int temp = sb.length();
                if(temp>count){
                    count=temp;
                }
                sb.delete(0,sb.length());
                set.clear();
            }
        }
        return count;
    }
}
