// import java.util.*;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
    //    frequency count
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // check condition
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])>1){
                return true;
            }
        }
        return false;

    }
}