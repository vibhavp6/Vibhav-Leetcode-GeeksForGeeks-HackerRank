class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0,j=0;
        int ans=0;
        int n=arr.length;
        while (j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while (i<=j&&map.size()>k){
                map.put(arr[i],map.get(arr[i])-1);
                if (map.get(arr[i])==0)map.remove(arr[i]);
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}
