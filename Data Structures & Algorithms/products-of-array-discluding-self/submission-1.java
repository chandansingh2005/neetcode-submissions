class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int result[] = new int[n];
        // initialize prefix
        prefix[0] = 1;
        // calculate the prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        // initialize the suffix
        suffix[n - 1] = 1;
        // calculate the suffix
        for (int i = n - 2; i >= 0;i --) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        // calculate the answer
        for(int i=0;i<n;i++){
            result[i]=prefix[i]*suffix[i];
        }
        return result;
    }
}
