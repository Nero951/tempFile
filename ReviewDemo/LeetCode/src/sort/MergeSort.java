package sort;


import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr){
        if(arr.length<2){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);//左闭右开，将数组从中间位置分开，前一半copy进left数组中
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);//后一半copy进right数组中
        return merge(mergeSort(left), mergeSort(right));//递归调用mergeSort
    }

    public static int[] merge(int[] left, int[] right){//将两个排好序的数组合并为一个排好序的数组
        int[] tmpArr = new int[left.length+right.length];

        for(int index=0, i=0, j=0; index<tmpArr.length; index++){
            if(i>=left.length){//当i>=left.length时，说明left数组已经遍历完，再进入循环，将right数组中的元素全部填进合并数组中
                tmpArr[index] = right[j++];
            }else if(j>=right.length){//同理
                tmpArr[index] = left[i++];
            }else if(left[i]>right[j]){//分别从left数组和right数组中拿出元素，谁小，就将谁放进合并数组中
                tmpArr[index]=right[j++];
            }else{
                tmpArr[index]=left[i++];
            }
        }
        return tmpArr;
    }
}
