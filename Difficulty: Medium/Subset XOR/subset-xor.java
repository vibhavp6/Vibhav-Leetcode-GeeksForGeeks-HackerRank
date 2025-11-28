class Solution {
    public static ArrayList<Integer> subsetXOR(int n) {
        // code here
        int xor=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            xor^=i;
            ans.add(i);
        }
        if(xor==n)return ans;
        else{
            int k=xor ^ n;
            ans.remove(Integer.valueOf(k));
            return ans;
        }
    }
}