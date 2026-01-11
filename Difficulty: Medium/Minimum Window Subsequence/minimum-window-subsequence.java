class Solution {
    static String minWindow(String s1, String s2) {
        int i = 0, j = 0, k = 0;
        int res = Integer.MAX_VALUE;
        
        String str = "";
        
        while(j < s1.length() && k < s2.length()){
            if(s1.charAt(j) == s2.charAt(k))
            k++;
            
            if(k == s2.length()){
                i = j;
                
                k = s2.length() - 1;
                
                while(i >= 0 && k >= 0){
                    if(s1.charAt(i) == s2.charAt(k))
                    k--;
                    i--;
                }
                
                i++;
                
                if(res > j - i + 1){
                    res = j - i + 1;
                    str = s1.substring(i, j + 1);  
                }
                k = 0; j = i + 1;
                
            }
            j++;
        }
        return str;
    }
}