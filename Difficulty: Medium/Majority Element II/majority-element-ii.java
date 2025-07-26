class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length ; 
        ArrayList<Integer> list = new ArrayList<>(); 
        
        Arrays.sort(arr) ; 
        int majority = n / 3 ; 
        int j = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            
            if(arr[i] != arr[j] ){
                
                if(majority < i - j){
                    list.add(arr[j]) ; 
                }
                
             j = i  ; 
            }
            
        }
        
        if(n - j > majority ){
            list.add(arr[j]) ; 
        }
        
        return list ;
    }
}

