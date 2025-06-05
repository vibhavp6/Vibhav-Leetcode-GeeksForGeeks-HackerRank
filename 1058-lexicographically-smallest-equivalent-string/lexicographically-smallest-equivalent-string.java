class DisjointSet{
    char[] parent = new char[26];
    public DisjointSet(){
        for(char c='a';c<='z';c++){
            parent[c-'a']=c;
        }
    }
    public char findpar(char c){
        if(parent[c-'a']==c)return c;
        parent[c-'a']=findpar(parent[c-'a']);//path compression
        return parent[c-'a'];
    }
    public void union(char a, char b){
        char parA=findpar(a);
        char parB= findpar(b);
        if(parA==parB)return;
        else if(parA<parB){
            parent[parB-'a']=parA;
        }else{
            parent[parA-'a']=parB;
        }
    }
}
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        DisjointSet ds = new DisjointSet();
        for(int i=0;i<s1.length();i++){
            ds.union(s1.charAt(i),s2.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<baseStr.length();i++){
            char c = ds.findpar(baseStr.charAt(i));
            sb.append(c);
        }
        return sb.toString();
    }
}