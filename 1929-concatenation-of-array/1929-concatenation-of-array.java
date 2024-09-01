class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int j=0;
        int ans[] = new int[2*n];
        for(int i=0;i<ans.length;i++){
            ans[i] = nums[j];
            if(j == n-1){
                j=0;
            }
            else j++;
        }
        return ans;
    }
}