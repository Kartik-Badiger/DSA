package Sorting_algorithms;

import java.util.Arrays;

public class mergesort1 {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(nums)));

    }
    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;

        }
        int[] left=mergesort(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] right=mergesort(Arrays.copyOfRange(arr,arr.length/2,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int merged[] = new int[left.length+ right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< left.length && j< right.length){
            if(left[i]<right[j]){
                merged[k]=left[i];
                i++;
            }else {
                merged[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            merged[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length){
            merged[k]=right[j];
            j++;
            k++;
        }
        return merged;
    }
}


















