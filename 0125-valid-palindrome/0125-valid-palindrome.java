class Solution {
    public boolean isPalindrome(String s) {
       String s1 = "";
        String s2 ="";
        
        if(s.length()<=1){
            return true;
        }
        
        int n= s.length();
        int i=0;
        int j=n-1;
        
        while(i<n && j>=0){
            if((s.charAt(i) >= 'A' && s.charAt(i) <='Z') || (s.charAt(i) >= 'a' && s.charAt(i) <='z') || (s.charAt(i) >= '0' && s.charAt(i) <='9')){
            	if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
            		int a = s.charAt(i) + 32;
            		char c = (char)a;
            		s1+=c;
            	}
            	else
                s1+=s.charAt(i);
                
            }
            if((s.charAt(j) >= 'A' && s.charAt(j) <='Z') || (s.charAt(j) >= 'a' && s.charAt(j) <='z') || (s.charAt(j) >= '0' && s.charAt(j) <='9')){
            	if((s.charAt(j) >= 'A' && s.charAt(j) <='Z')){
            		int a = s.charAt(j) + 32;
            		char c = (char)a;
            		s2+=c;
            	}
            	else
                s2+=s.charAt(j);
                
            }
            i++;
            j--;
        
        }
        
        return s1.equals(s2);
    }
}