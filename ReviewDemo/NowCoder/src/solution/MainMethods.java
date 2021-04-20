package solution;

import java.util.*;

/**
 * @author: Wade
 * @create: 2021/1/10
 */
public class MainMethods {
    public static void main(String[] args) {
        try{
            int n = 10/0;
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            Throwable t = new Throwable();
            System.out.println(t.getMessage());
            t.getCause();
            System.out.println(t.getClass());
            t.getStackTrace();
            t.printStackTrace();

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
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[0];
        for(int i = 0; i < nums.length; i+=2){
            for(int j = 0; j < nums[i]; j++){
                arr[j++]=nums[i+1];
            }
        }
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2= new TreeMap<>();

    }
}
