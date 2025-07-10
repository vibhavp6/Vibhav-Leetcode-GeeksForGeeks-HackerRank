class Solution {
    public String longestString(String[] arr) {
        // code here
        String ans="";
        Set<String> h=new HashSet<>();
        for(String s:arr) h.add(s);
        for(String s:arr){
            if(ans.length()>s.length() || (ans.length()==s.length() && ans.compareTo(s)<0)) continue;
            boolean pr=true;
            for(int i=0;i<s.length();i++){
                if(!h.contains(s.substring(0,i+1))){
                    pr=false;
                    break;
                }
            }
            if(pr) ans=s;
        }
        return ans;
    }
}