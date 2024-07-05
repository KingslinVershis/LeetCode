class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String a[] = s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            if(a[i] == ""){
        	continue;
           }
            ans+=a[i]+" ";
        }
    return ans.trim();
    }
    
}