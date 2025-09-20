class Solution {
    static void findnge(int arr[],int nge[],int n)
    {
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())nge[i]=n;
            else nge[i]=st.peek();
            st.push(i);
        }
    }
    static void findpge(int arr[],int pge[],int n)
    {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())pge[i]=-1;
            else pge[i]=st.peek();
            st.push(i);
        }
    }
    public static int longestSubarray(int[] arr) {
        // code here
        int n=arr.length;
        int nge[]=new int[n];
        int pge[]=new int[n];
        findnge(arr,nge,n);
        findpge(arr,pge,n);
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int l=pge[i];
            int r=nge[i];
            if(r-l-1>=arr[i])ans=Math.max(ans,r-l-1);
        }
        return ans;
    }
}

