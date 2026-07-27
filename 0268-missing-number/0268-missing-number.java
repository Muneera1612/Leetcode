class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int formula=(n*(n+1))/2;
        int missing_value=formula-sum;
        return missing_value;
    }
}