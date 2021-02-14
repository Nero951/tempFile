package database;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(readNumber(n, arr));
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
        ListNode l = new ListNode();
        while(l1!=null){
            int a = l1.val+ l2.val;
            int count =0;
            if(count==0){
                if(a<=9){
                    lastAdd(l, a);
                }else{
                    lastAdd(l, a%10);
                    count = a/10;
                }
            }else{
                if(a<=9){
                    if(a+count<=9){
                        lastAdd(l, a+count);
                    }else {
                        lastAdd(l, (a+count)%10);
                        count=(a+count)/10;
                    }
                }else{
                    if(a+count<=9){
                        lastAdd(l, a+count);
                    }else {
                        lastAdd(l, (a+count)%10);
                        count=(a+count)/10;
                    }
                }
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l;
    }
    public void lastAdd(ListNode l, int val){
        ListNode cur = l;
        if(cur==null){
            cur.val = val;
        }else{
            while(cur!=null){
                cur = cur.next;
            }
            cur.val=val;
        }
    }
}
