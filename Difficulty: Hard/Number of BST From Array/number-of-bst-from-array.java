class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        // Code here
        int n = arr.length;
        int[] arr2 = Arrays.copyOfRange(arr,0,n);
        Arrays.sort(arr2);
        
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            hm.put(arr2[i],i);
        }
        
        for(int i = 0; i < n; i++){
            int ans = find(arr2,hm.get(arr[i]),0,n-1);
            list.add(ans);
        }
        
        return list;
    }
    private static int find(int[] arr, int idx, int si, int ei){
        if(si == ei) return 1;
        
        int leftSum = 0, rightSum = 0;
        
        for(int i = idx-1; i >= si; i--) leftSum += find(arr,i,si,idx-1);
        
        for(int i = idx+1; i <= ei; i++) rightSum += find(arr,i,idx+1,ei);
        
        if(leftSum == 0) leftSum = 1;
        if(rightSum == 0) rightSum = 1;
        
        return leftSum*rightSum;
    }
}