package Sorting_algorithms;

public class Binarysearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(binarySearch(nums,5));
    }
    public static int binarySearch(int[] arr,int element){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<element){
                left=mid+1;
            } else if (arr[mid]>element) {
                right=mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
