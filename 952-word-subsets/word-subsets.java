class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list=new ArrayList();
        int n=words1.length;
        int m=words2.length;

        int[] bMaxFreq=new int[26];           
      // Calculate maximum frequency for each character in words2      
        for(int i=0; i<m; i++){
            int[] bArr=new int[26];
            for(char ch:words2[i].toCharArray()){
                int idx=ch-'a';
                bArr[idx]++;
                bMaxFreq[idx] = (bMaxFreq[idx]<bArr[idx])?bArr[idx]:bMaxFreq[idx];
            }
        }

        // Check each word in words1
        for(int i=0; i<n; i++){
            int[] aArr=new int[26];       
            for(char ch:words1[i].toCharArray()){
                aArr[ch-'a']++;
            }

            if(checkSubset(bMaxFreq, aArr)){
                list.add(words1[i]);
            }
        }
        
        return list;
    }

    boolean checkSubset(int[] bArr, int[] aArr){
     
        for(int i=0; i<26; i++){
            if(bArr[i]>aArr[i]){
                return false;
            }
        }    
            
        return true;
    }
}