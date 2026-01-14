class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        if(k==0)
        return 0;
        
        Queue<Integer>q= new LinkedList<>();

        int n=arr.length;
        int i=0;
        int ans=0;
        while(i<n)
        {
         
               while(!q.isEmpty()&&i-q.peek()>k)
               {
                   q.poll();
               }
               if(!q.isEmpty()&&arr[q.peek()]!=arr[i])
               {
                   q.poll();
                   ans++;
               }
             else{
                 q.add(i);
             }
               
           i++;
        }
        
        return ans;
    }
}

