class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // If current number is negative, swap max and min
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            // Update maximum product ending at current index
            if (max * nums[i] > nums[i]) {
                max = max * nums[i];
            } else {
                max = nums[i];
            }
            // Update minimum product ending at current index
            if (min * nums[i] < nums[i]) {
                min = min * nums[i];
            } else {
                min = nums[i];
            }
    
            // Update overall maximum product
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}