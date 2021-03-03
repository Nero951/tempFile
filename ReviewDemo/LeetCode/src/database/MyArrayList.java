package database;

public class MyArrayList {
    public int usedSize;
    public int[] elem;
    public static final int intCapacity=10;

    public MyArrayList(int usedSize, int[] elem) {
        this.usedSize = usedSize;
        this.elem = new int[intCapacity];
    }


    public boolean addFirst(int val){
        if(usedSize==0){
            elem[0]=val;
            usedSize++;
        }else{
            if(usedSize<10){
                for(int i=usedSize; i>0; i--){
                    elem[i+1] = elem[i];
                }
                elem[0] = val;
            }
        }
        return true;
    }
}
