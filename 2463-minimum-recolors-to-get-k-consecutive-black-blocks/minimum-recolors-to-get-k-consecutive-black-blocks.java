class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int wCnt=0;

        // Count white blocks in the initial window of size k
        for(int l=0; l<k; l++){
            if(blocks.charAt(l)=='W'){
                wCnt++;
            }
        }
        
        int i=1, j=k; //Two Pointers
        int cnt=wCnt;

        // Slide the window through the string
        while(i<n && j<n){       
            // Subtract the "W" block leaving the window     
            if(blocks.charAt(i-1)=='W'){
                wCnt-=1;
            }
            // Add the "W" block entering the window
            if(blocks.charAt(j)=='W'){
                wCnt+=1;
            }
            cnt=wCnt<cnt?wCnt:cnt;
            i++; j++;
        }      

        return cnt;
    }
}