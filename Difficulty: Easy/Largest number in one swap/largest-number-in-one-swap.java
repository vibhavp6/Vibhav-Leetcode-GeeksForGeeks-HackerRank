class Solution {
    public String largestSwap(String s) {
        // code here
        char[] arr=s.toCharArray();
        int n=arr.length;
        
        int[] last=new int[10];
        
        for(int i=0; i<n; i++){
            last[arr[i]-'0']=i;
        }
        
        for(int i=0; i<n; i++){
            int current=arr[i]-'0';
            
            for(int d=9; d>current; d--){
                if(last[d]>i){
                    char temp=arr[i];
                    arr[i]=arr[last[d]];
                    arr[last[d]]=temp;
                    return new String(arr);
                }
            }
        }
        return s;
        
    }
}