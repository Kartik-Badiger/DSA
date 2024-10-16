package Sorting_algorithms;

import java.util.Arrays;

import static Sorting_algorithms.selectionsort.swap;
//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class PracAlgo {
    public static void main(String[] args) {
        int [] nums ={5,4,3,2,1};
//        bubbleSort(nums);/////////
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length ; j++) {
                if(nums[j]<nums[i]){
                    swap(nums,i,j);
                }
            }
        }
    }

    public static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                }else {
                    break;
                }
            }

        }

    }
//    public static void selectionSort(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            int
//        }
//
//    }



}
