package Sorting_algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(nums)));
    }
    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int [] left= mergesort(Arrays.copyOfRange(arr,0,arr.length/2));
        int [] right=mergesort(Arrays.copyOfRange(arr,arr.length/2,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] first,int[] second){
        int [] merged= new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                merged[k]=first[i];
                i++;
            }else{
                merged[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            merged[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            merged[k]=second[j];
            k++;
            j++;
        }
        return merged;
    }
}
