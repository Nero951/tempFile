package database;


import java.util.*;

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
            System.out.println(lengthOfLongestSubstring1(s));
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
        Set<Character> set = new HashSet<>();
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

    /**
     * 使用滑动窗口法解决，遍历字符串，将每一个字符作为键，位置作为值传入map，
     * 每次传入前判断是否有已经存在相同字符，如存在，则将重复字符出现的下一位作为左边的起始位置，
     * 将此时的遍历位置与起始位置相减得到该子串的长度，取最大值即为最长不连续子串的长度。
     * @param s
     * @return 最长无重复连续子串的长度
     */
    public static int lengthOfLongestSubstring1(String s){
        if(s.isEmpty()) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max=Math.max(max, i-left+1);
        }
        return max;
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        return 0;
    }
}
