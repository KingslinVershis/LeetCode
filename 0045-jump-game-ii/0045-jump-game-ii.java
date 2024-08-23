class Solution {
    public int jump(int[] nums) {
        int count =0;
        int start=0;
        int end =0;
        if(nums.length <= 1){
            return 0;
                    }
        for(int i=0;i<nums.length;i++){
            
            if(i+nums[i] > start){
                start = i+nums[i];
            }
            if(i == end){
                end = start;
                count++;
                if(end >= nums.length-1){
                return count;
            }
            }
            if(nums[i]==0 && i == end){
                return -1;
            }
            
        }
        return count;
    }
}