class Solution {
    public int countSubarrays(int[] arr, int k) {
        LinkedList<Integer>lt = new LinkedList<>();
        int pr = -1,ans=0,n = arr.length;
        for(int i=0;i<=n;i++){
            if(i==n || arr[i]%2==1){
                if(lt.size()==k){
                    int f = lt.getFirst()-pr;
                    int s = i-lt.getLast();
                    ans+=f*s;
                    pr=lt.removeFirst();
                }
                lt.add(i);
            }
        }
        return ans;
    }
}
