package solution;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class solution {
    public static void main(String[] args) {
        solution s = new solution();
        int[] arr = {2,1,5,3,4};
        int[] tmp = s.solve(arr);
        System.out.println(Arrays.toString(tmp));
    }
    public int[] solve(int[] arr){
        if(arr.length == 0) return null;
        int[] tmp = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int j = 0;
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i] > stack.peek() && arr[i] > arr[i + 1]){
                stack.push(arr[i]);
                tmp[j++] = stack.pop();
            }
            stack.push(arr[i]);
        }
        while(stack!=null){
            tmp[j++] = stack.pop();
        }
        return tmp;
    }

    public int findTheNumber (int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int tmp = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(!set.add(arr[i])){
                count++;
                if(count==k){
                    set.remove(arr[i]);
                }
            }
            set.add(arr[i]);
        }
        
    }
}
