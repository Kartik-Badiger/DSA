package Sorting_algorithms;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int nums[]={5,4,3,2,1};
        System.out.println(Arrays.toString(selectionsort(nums)));
    }
//    public static int[] selectionsort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int last=arr.length-i-1;
//            int maxIndex=getMaxIndex(arr,0,last);
//            swap(arr,last,maxIndex);
//        }
//        return arr;
//    }

//    private static int getMaxIndex(int[] arr,int start,int end) {
//        int max=start;
//        for (int i = start; i <=end; i++) {
//            if(arr[max]<arr[i]){
//                max=i;
//            }
//        }
//        return max;
//    }

    public static int[] selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           int last=arr.length-i-1;
           int maxIndex=getMaxIndex(arr,0,last);
           swap(arr,last,maxIndex);
        }
        return arr;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <=end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
