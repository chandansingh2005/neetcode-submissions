class Solution {
    public int majorityElement(int[] nums) {
        int count=0,ele=0;
        // loop through in nums
        for(int i=0;i<nums.length;i++){
            // case 1
            if(count==0) ele=nums[i];
            // case 2
            if(ele==nums[i]) count++; // count increase
            else count--; // count descrease
        }

        return ele;
    }
}