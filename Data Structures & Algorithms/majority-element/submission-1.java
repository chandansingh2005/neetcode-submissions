class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        // frequency count
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // second loop and condition check
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return 0;
    }
}