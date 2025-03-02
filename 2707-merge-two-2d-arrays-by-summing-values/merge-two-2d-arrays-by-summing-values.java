class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int[] i : nums1){
            hm.put(i[0],i[1]);
        }
        for (int[] i : nums2){
            if (hm.containsKey(i[0])){
                hm.put(i[0],hm.get(i[0])+i[1]);
            }
            else{
                hm.put(i[0],i[1]);
            }
        }
        int[] arr=new int[hm.size()];
        int x=0;
        for (int i : hm.keySet()){
            arr[x]=i;
            x++;
        }
        Arrays.sort(arr);
        int[][] arr2=new int[hm.size()][2];
        for (int i=0;i<arr.length;i++){
            arr2[i]=new int[]{arr[i],hm.get(arr[i])};
        } 
        return arr2;
    }
}