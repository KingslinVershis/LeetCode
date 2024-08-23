class Solution {
    public boolean canJump(int[] nums) {
       int jump=nums[0];
        for(int i=1;i<nums.length;i++){
           jump--;
            if(jump < 0) return false;
            if(i == nums.length) return true;
            if(nums[i] > jump)
                jump = nums[i];
        }
        return true;
    
    }
}