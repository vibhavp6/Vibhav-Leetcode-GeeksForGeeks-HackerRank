class Solution {
    int getLPSLength(String s) {
        // code here
        int n=s.length();
        int p=0;
        int su=1;
        int count=0;
        int pos=1;
        while(p<n && su<n){
            if(s.charAt(p)==s.charAt(su)){
                p++;
                su++;
                count++;
            }
            else{
                p=0;
                count=0;
                pos++;
                su=pos;
            }
        }
        return count;
    }
} 