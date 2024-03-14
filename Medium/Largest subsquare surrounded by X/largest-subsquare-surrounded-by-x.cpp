//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int largestSubsquare(int n, vector<vector<char>> a) {
        // code here
        int v[n][n]; 
        int h[n][n]; 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                v[i][j] = 0; 
                h[i][j] = 0; 
                if(a[i][j] == 'X') {
                    if(i==0){
                       v[i][j] =1; 
                    }
                    else{
                        v[i][j] = v[i-1][j] + 1;
                    }
                }
                if(a[i][j] == 'X') {
                    if(j==0){
                       h[i][j] =1;
                    }
                    else{
                      h[i][j] =  h[i][j-1] + 1;
                    }
                }
            }
        }
        int maxS = 0; 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(v[i][j] == 0 || h[i][j] == 0) {
                    continue; 
                }
                int curr = min(v[i][j], h[i][j]); 
                while(curr> 0) {
                    int v1 = i - curr + 1; 
                    int h1 = j - curr + 1;
                    
                    if(h[v1][j] >= curr && 
                    v[i][h1] >= curr) {
                        maxS = max(maxS, curr);
                        break; 
                    }
                    curr--; 
                }
                
            }
        }
        return maxS; 
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<vector<char>> a(n, vector<char>(n));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) cin >> a[i][j];
        }
        Solution ob;
        cout << ob.largestSubsquare(n, a) << "\n";
    }
}
// } Driver Code Ends