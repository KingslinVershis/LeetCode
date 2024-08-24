class Solution {
    public int maxOperations(int[] nums, int k) {
       int n = nums.length;
        int l =0;
        int r = n-1;
        int count=0;
        if(k == 1){
            return 0;
        }
        Arrays.sort(nums);
        while(l<r){
            int val = nums[l]+nums[r];
            
            if(val == k){
                count++;
                l++;
                r--;
            }
         else if(val < k){ 
             l++;
        }
        else r--;    
        }
        return count;
    }
}