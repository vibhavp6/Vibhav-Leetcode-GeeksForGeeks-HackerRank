//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution{
  public:
    char nthCharacter(string str, int r, int n) {
        int power=pow(2,r);
        int index=n/power;
        int x = n%power;
        vector<bool>v;
        v.push_back(str[index]-'0');
        while(v.size()<=x){
            int size=v.size();
            int i=0;
            while(i<size){
                v.push_back(!v[i]);
                i++;
            }
        }
        if(v[x]) return '1';
        else return '0';
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int R, N;
        string S;
        cin >> S >> R >> N;
        Solution ob;
        cout << ob.nthCharacter(S, R, N) << endl;
    }
    return 0;
}
// } Driver Code Ends