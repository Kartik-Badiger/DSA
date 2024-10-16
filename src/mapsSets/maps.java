package mapsSets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {


    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums={5,4,3,2,1,1,1,1};
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }




    }
}
