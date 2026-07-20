class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int pointer=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    pointer++;
                }
            }
            if(pointer==1){
                return nums[i];
            }
        }
        return -1;       
    }
}