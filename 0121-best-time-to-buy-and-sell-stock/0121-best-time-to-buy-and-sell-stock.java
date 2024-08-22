class Solution {
    public int maxProfit(int[] prices) {
       int buy_price = prices[0];
       int sell_price =0;
       int max = 0; 
       for(int i=1;i<prices.length;i++){
           if(buy_price>prices[i]){
               buy_price = prices[i];
           }
           else{
               sell_price = prices[i] - buy_price;
               max = Math.max(max,sell_price);
           }
       }
        return max;
    }
}