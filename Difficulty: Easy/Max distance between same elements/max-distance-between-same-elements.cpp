//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    int maxDistance(vector<int> &arr) {
        // Code hereint n=arr.size();
        int n=arr.size();
        unordered_map<int,int> mp;
        int maximum=0;
        for(int i=0;i<n;i++){
            if(mp.find(arr[i])==mp.end()){
               mp[arr[i]]=i;
            }
        }
        for(int i=0;i<n;i++){
            maximum=max(maximum,i-mp[arr[i]]);
        }
        return maximum;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);

        stringstream s1(input);
        int num;
        while (s1 >> num) {
            arr.push_back(num);
        }

        Solution ob;
        cout << ob.maxDistance(arr) << endl;
    }
    return 0;
}
// } Driver Code Ends