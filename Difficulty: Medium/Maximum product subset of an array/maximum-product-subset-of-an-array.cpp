//{ Driver Code Starts
/* Driver program to test above function */

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    long long int findMaxProduct(vector<int>& arr) {
        int n = arr.size();
        if(n==1) return arr[0];
        long long mod = 1e9+7;
        int flag = 0;
        long long prod = 1, mini = INT_MIN;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                flag = 1;
                continue;
            }
            if(arr[i]>0){
                prod = ((prod)%mod * arr[i])%mod;
            }
            else if(arr[i]<0){
                prod = ((prod)%mod * arr[i])%mod;
                mini = max((long long)arr[i],mini);
            }
        }
        if(prod<0){
            prod = prod/mini;
        }
        if(prod==1 && flag==1) return 0;
        return prod;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        long long int ans = ob.findMaxProduct(arr);
        cout << ans << endl;
    }
    return 0;
}

// } Driver Code Ends