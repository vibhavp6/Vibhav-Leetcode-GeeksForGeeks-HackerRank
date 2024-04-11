//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    // function to convert a given Gray equivalent n to Binary equivalent.
    int grayToBinary(int n)
    {
        
        // Your code here
         vector<int>ans;
        while(n){
            int a=n%2;
            n=n/2;
            ans.push_back(a);
        }
        
        reverse(ans.begin(),ans.end());
        int sum=0;
    
        int size=ans.size();
        
        for(int i=1;i<size;i++){
       
            ans[i]=ans[i-1]^ans[i];
        }
        
        int j=0;
        
        for(int i=size-1;i>=0;i--){
            sum=sum+ ans[i] * pow(2,j);
            j++;
        }
        
        return sum;
        
    }
};

//{ Driver Code Starts.

// Driver code
int main()
{
    int t,n;
    cin>>t;//testcases
    while(t--)
    {
        cin>>n;//initializing n
        
        Solution ob;
        //calling function grayToBinary()
       cout<< ob.grayToBinary(n)<<endl;
    }
}

// } Driver Code Ends