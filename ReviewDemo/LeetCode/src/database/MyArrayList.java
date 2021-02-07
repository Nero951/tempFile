package database;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Wade
 * @create: 2021/1/24
 */
class MyArray{
    public Object[] arr;
    public int size;
    public int usedSize;
    private final int capacity = 10;
}
/**
 * @author Wade Winston Wilson
 */
public class MyArrayList {
    List<Integer> list = new ArrayList<>();
    MyArray array = new MyArray();
    public boolean isEmpty(){
        if(array.usedSize==0){
            return true;
        }
        return false;
    }
    public void addFirst(Object o){
        if(array.usedSize==0){ 
            array.arr[0]=o;
            array.usedSize++;
        }else{
        }
    }

}
