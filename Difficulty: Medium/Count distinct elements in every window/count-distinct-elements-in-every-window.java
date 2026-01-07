class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int j=0; j<n; j++){
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            
            if(j - i + 1 == k){
                res.add(map.size());
                if(map.containsKey(arr[i]) && map.get(arr[i]) > 1){
                    map.put(arr[i], map.get(arr[i]) - 1);
                }else{
                    map.remove(arr[i]);
                }
                i++;
            }
            
        }
        
        return res;
        
    }
    private int count(int[] arr, int i, int j){
        Map<Integer, Integer> map = new HashMap<>();
        while(i <= j){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            i++;
        }
        return map.values().size();
    }
}