package database;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public int usedSize;
    public int[] elem;
    public static final int intCapacity=10;
    List<Integer> list = new ArrayList<>();

    public MyArrayList() {
        elem = new int[intCapacity];
        usedSize = 0;
    }

    public boolean addFirst(int val){
        if(usedSize==0){
            elem[0]=val;
            usedSize++;
        }else{
            for(int i=usedSize; i>0; i--){
                elem[i] = elem[i-1];
            }
        }
        return true;
    }
}
