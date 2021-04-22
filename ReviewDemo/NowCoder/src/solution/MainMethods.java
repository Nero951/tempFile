package solution;

import java.util.*;

/**
 * @author: Wade
 * @create: 2021/1/10
 */
public class MainMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(Arrays.toString(decompressRLElist(arr)));
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int mid = length/2;
        int i = 0;
        int j = 0;
        while(i < mid && j < mid){
            if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        return 0;
    }
    public static int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2){
            sum+=nums[i];
        }
        int[] arr = new int[sum];
        int j = 0;
        for(int i = 0; i < nums.length; i+=2){
            while(nums[i]!=0){
                arr[j] = nums[i+1];
                j++;
                nums[i]--;
            }
        }
        return arr;
    }
    public boolean isMonotonic(int[] A) {
        if(A.length==1) return true;
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i < A.length-1; i++){
            if(A[i] < A[i+1]) dec = false;
            if(A[i] > A[i+1]) inc = false;
        }
        return dec || inc;
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
//        int[] arr = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            
        }
        return null;
    }
}
