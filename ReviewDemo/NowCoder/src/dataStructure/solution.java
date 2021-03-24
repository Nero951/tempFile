package dataStructure;


import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void maxWaterCap(){

    }
    public String[] getFolderNames(String[] names) {

        return null;
    }

    public List<Integer> findRepeatNumber(int[] arr){
        if(arr.length==0) return null;
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

    public int cuttingRop(int n, int m){

        return 0;
    }
}
