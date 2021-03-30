package dataStructure;


import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void maxWaterCap() {

    }

    public String[] getFolderNames(String[] names) {

        return null;
    }

    public List<Integer> findRepeatNumber(int[] arr) {
        if (arr.length == 0) return null;
        List<Integer> list = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        for (int j : arr) {
            if (!list.isEmpty() && !list.contains(j)) {
                tmpList.add(j);
            }
            list.add(j);
        }
        return tmpList;
    }

    public int cuttingRop(int n, int m) {

        return 0;
    }

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
    //public int fib(int n) {
    //    if(n==0) return 0;
    //    if(n<=2) return 1;
    //    return fib(n-1)+fib(n-2);
    //}
//    public int fib(int n) {
//        int[] arr = new int[n];
//        if(n==0) return 0;
//        int i = 0;
//        for(; i < n; i++){
//            if(i<2){
//                arr[i] = 1;
//                continue;
//            }
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//        return arr[i-1];
//    }
    public int fib(int n) {
        if(n==0) return 0;
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a+b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public int minArray(int[] numbers) {
        if(numbers.length==0) return 0;
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            int pivot = low + (high-low)/2;
            if(numbers[pivot] < numbers[high])
                pivot = high;
            else if(numbers[pivot] > numbers[high])
                low = pivot+1;
            else
                high-=1;
        }
        return numbers[low];
    }
}
