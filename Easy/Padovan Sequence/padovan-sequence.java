//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
             int mod=(int)Math.pow(10,9)+7;
     // System.out.println(mod);
      int sum=0,a,b,c;
      a=b=c=1;
      if(n<3){
          return 1;
      }
      for(int i=3;i<=n;i++){
          sum=(a+b)%mod;
         // System.out.println(sum);
          a=b;
          b=c;
          c=sum;
      }
      return sum;
    }
    
}
