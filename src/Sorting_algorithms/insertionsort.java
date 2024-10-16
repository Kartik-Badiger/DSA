package Sorting_algorithms;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int []nums={5,4,3,2,1,56};
        System.out.println(Arrays.toString(insertion(nums)));
    }
    public static int[] insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
