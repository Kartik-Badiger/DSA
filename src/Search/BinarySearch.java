package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        int target=4;
        System.out.println(binarySearch(nums,4));

    }
    public static int binarySearch(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                right=mid-1;
            }
            if(nums[mid]>target){
                left=mid+1;
            }
        }
        return -1;

    }
}
