class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // Code here
        int[] pattern=new int[pat.length()+1];
        for(int i=1,s=0;i<pat.length();){
            if(pat.charAt(i)==pat.charAt(s)){
                pattern[i]=++s;
                i++;
            }else if(s>0) s=pattern[s-1];
            else i++;
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0,s=0;i<txt.length();i++){
            if(txt.charAt(i)==pat.charAt(s)) s++;
            else{
                while(s>0){
                    s=pattern[s-1];
                    if(txt.charAt(i)==pat.charAt(s)){
                        s++;
                        break;
                    }
                }
            }
            if(s==pat.length()){
                list.add(i-s+2);
                s=pattern[s-1];
            }
        }
        
        return list;
    }
}