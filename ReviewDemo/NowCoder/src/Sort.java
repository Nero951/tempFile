import java.util.*;

public class Sort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scan.nextInt();
            }
            mainSort s = new mainSort();
//            s.bubbleSort(arr);
//            s.quickSort(arr);
//            s.selectSort(arr);
            List<Integer> list = new ArrayList<>();

            System.out.println(Arrays.toString(arr));
        }
    }
}
class mainSort{
    private void temp(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void bubbleSort(int[] arr){
        if(arr.length<2) return;
//        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    temp(arr, j, j+1);
//                    flag = false;
                }
            }
        }
    }

    public void quickSort(int[] arr){
        if(arr.length<2) return;
        quick(arr, 0, arr.length-1);
    }
    private void quick(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quick(arr, low, pivot-1);
            quick(arr, pivot+1, high);
        }
    }
    private int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        while(low < high){
            while(low<high && arr[high]>=pivot) {--high;}
            arr[low] = arr[high];
            while(low<high && arr[low]<=pivot) {++low;}
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    public void selectSort(int[] arr){
        if(arr.length<2) return;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp(arr, i, j);
                }
            }
        }
    }

    public void insertSort(int[] arr){
        if(arr.length<2) return;
        for(int i = 0; i < arr.length; i++){
            int tmp = arr[i];
            int j;
            for(j = i-1; j>=0; j--){
                if(arr[j]>tmp)
                    arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length < k) return null;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else {
                map.put(n, 1);
            }
        }
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for(int n : map.keySet()){
            if(queue.size()<k){
                queue.add(n);
            }else if(map.get(n)>map.get(queue.peek())){
                queue.remove();
                queue.add(n);
            }
        }
        int[] res = new int[queue.size()];
        for(int i = 0; !queue.isEmpty(); i++){
            res[i] = queue.remove();
        }
        return res;
    }
}
