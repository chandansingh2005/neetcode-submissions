class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, m = 0, h = n - 1;
        while (m <= h) {
            // case 1 for red colour
            if (nums[m] == 0) {
                int temp = nums[l];
                nums[l++] = nums[m];
                nums[m++] = temp;
            } else if (nums[m] == 1) {
                // case 2 for colour white
                m++;
            } else {
                // case 3 for colour blue 
                int temp = nums[h];
                nums[h--] = nums[m];
                nums[m] = temp;
            }
        }
    }
}