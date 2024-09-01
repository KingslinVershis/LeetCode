class Solution {
    public int maximumWealth(int[][] accounts) {
            int max =0;
            int sum=0;
            int n=accounts.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<accounts[i].length;j++){
                    sum += accounts[i][j];
                    max = Math.max(sum,max);
                }
                sum=0;
            }
        return max;
    }
}