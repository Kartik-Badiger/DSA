package Sorting_algorithms;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] nums={5,4,3,2,1,56,13};
        System.out.println(Arrays.toString(bubblesort(nums)));
    }

    public static int[] bubblesort(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
