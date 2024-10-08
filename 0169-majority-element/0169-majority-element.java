class Solution {
    public int majorityElement(int[] nums) {
        int target = -1;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(counter == 0){
                target = nums[i];
                counter++;
            }else if(nums[i] == target){
                counter++;
            }else if(nums[i] != target){
                counter--;
            }
        }
        return target;
    }
}