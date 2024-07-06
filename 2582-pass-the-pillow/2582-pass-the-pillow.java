class Solution {
    public int passThePillow(int n, int time) {
		int i=1;
        int ans =0;
        int count =0;
        while(time !=0){
            if(i==n ){
                count++;
                i--;
                ans = i;
                time--;       
           }
            else if(count>0 && i > 1){
                i--;
                ans = i;
                time--;
            }
            else{
            i++;
            ans = i;
            time--;
            count =0;
        }
}

        return ans;
    }
}