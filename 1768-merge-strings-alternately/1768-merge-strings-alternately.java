class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int w1 = word1.length();
        int w2 = word2.length();
        int len = Math.max(w1,w2);
        for(int i=0;i<len;i++){
            if(i < w1){
                s+=word1.charAt(i);
            }
            if(i<w2){
                s+=word2.charAt(i);
            }
        }
        
        return s;
    }
}