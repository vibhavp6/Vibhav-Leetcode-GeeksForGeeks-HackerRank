//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
void solve(int one ,int zero , vector<string>&ans,string op , int n){
        if(zero+one>=n){
            ans.push_back(op);
            return;
        }
        solve(one+1,zero,ans,op+'1',n);
        if(one>zero){
            solve(one,zero+1,ans,op+'0',n);
        }
    }
    
public:	
	vector<string> NBitBinary(int n)
	{
	    vector<string>ans;
	    solve(0,0,ans,"",n);
	    return ans;
	}
};

//{ Driver Code Starts.

int main() 
{
   	

   	ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
   
   	int t;
   	cin >> t;
   	while(t--)
   	{
   		int n;
   		cin >> n;
        Solution ob;
   		vector<string> ans = ob.NBitBinary(n);

   		for(auto i:ans)
   			cout << i << " ";

   		cout << "\n";
   	}

    return 0;
}
// } Driver Code Ends