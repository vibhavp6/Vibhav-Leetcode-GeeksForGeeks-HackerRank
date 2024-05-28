//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

class Array {
  public:
    template <class T>
    static void input(vector<T> &A, int n) {
        for (int i = 0; i < n; i++) {
            scanf("%d ", &A[i]);
        }
    }

    template <class T>
    static void print(vector<T> &A) {
        for (int i = 0; i < A.size(); i++) {
            cout << A[i] << " ";
        }
        cout << endl;
    }
};


// } Driver Code Ends

class Solution {
  public:
  int help(int n, int w, vector<int> &cost, vector<int>&dp) {
        
        if(w==0) return 0;
        
        if(dp[w]!=-1) return dp[w];
        
        int ans = INT_MAX;
        
        for(int i=1;i<=min(n,w);i++)
        {
           
            
                ans = min(ans,help(n,w-i,cost,dp)+cost[i-1]);
            
        }
        return dp[w] = ans;
  }
    int minimumCost(int n, int w, vector<int> &cost) {
       

vector<int>dp(w+1,-1);
int ans = help(n,w,cost,dp);
 if(ans==INT_MAX) return -1;
 return ans;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d ", &t);
    while (t--) {

        int n;
        scanf("%d", &n);

        int w;
        scanf("%d", &w);

        vector<int> cost(n);
        Array::input(cost, n);

        Solution obj;
        int res = obj.minimumCost(n, w, cost);

        cout << res << endl;
    }
}

// } Driver Code Ends