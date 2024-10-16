import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int [] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(quicksort(nums,0, nums.length-1)));
    }
    public static int[] quicksort(int[] arr ,int low ,int high){
        if(low>high){
            return null;
        }
        int s=low;
        int e=high;
        int mid= s +(e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }
        quicksort(arr,s,high);
        quicksort(arr,low,e);
        return arr;
    }
}
