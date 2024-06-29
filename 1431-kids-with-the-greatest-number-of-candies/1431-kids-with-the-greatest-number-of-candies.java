class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list = new ArrayList<Boolean>();
        int sum =0;
        int max = -1;
        for(int candy : candies){
            if(max < candy){
                max = candy;
            }
        }
        for(int candy : candies){
             sum = candy + extraCandies;
             if(sum >= max){
                 list.add(true);
             }
             else
                 list.add(false);
        }
    
            return list;
    }
}