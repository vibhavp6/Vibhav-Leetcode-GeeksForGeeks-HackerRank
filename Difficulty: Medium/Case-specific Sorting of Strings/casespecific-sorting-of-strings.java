class Solution {
    public static String caseSort(String s) {
        // code here
        int[] ufreq = new int[26];
        int[] lfreq = new int[26];
        for(char ch : s.toCharArray()){
            if(ch>='a' && ch<='z') lfreq[ch-'a']++;
            else ufreq[ch-'A']++;
        }
        int i=0, j=0;
        StringBuilder sb = new StringBuilder("");
        for(int k=0; k<s.length(); k++){
            if(s.charAt(k)>='a' && s.charAt(k)<='z'){
                while(lfreq[i] == 0) i++;
                sb.append((char)(i+'a'));
                lfreq[i]--;
            }
            else{
                while(ufreq[j] == 0) j++;
                sb.append((char)(j+'A'));
                ufreq[j]--;
            }
        }
        return sb.toString();
    }
}