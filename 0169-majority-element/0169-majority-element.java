class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candiate=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(count==0){
                candiate=num;  
            }
            if(num==candiate){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == candiate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candiate;
        }

        return -1;
    }
}