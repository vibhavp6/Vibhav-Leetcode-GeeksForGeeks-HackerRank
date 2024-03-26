//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++
class Solution {
public:
    bool isAdditiveSequence(string s) {
        int n = s.size();
        for (int i = 0; i < min(8, n); ++i) {
            for (int j = i + 1; j < min(8, n); ++j) {
                string temp1 = s.substr(0, i + 1);
                string temp2 = s.substr(i + 1, j - i);
                if ((temp1.size() > 1 && temp1[0] == '0') || (temp2.size() > 1 && temp2[0] == '0'))
                    continue; // Avoid leading zeros
                long long num1 = stoll(temp1);
                long long num2 = stoll(temp2);
                int k = j + 1;
                while (k < n) {
                    long long sum = num1 + num2;
                    string temp3 = to_string(sum);
                    if (k + temp3.size() > n || s.substr(k, temp3.size()) != temp3)
                        break; // Not a valid additive sequence
                    k += temp3.size();
                    num1 = num2;
                    num2 = sum;
                    if (k == n)
                        return true; // Valid additive sequence
                }
            }
        }
        return false; // No valid additive sequence found
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;

    Solution sol;

    while (t--) {
        string s;
        cin >> s;

        bool result = sol.isAdditiveSequence(s);
        cout << result << endl;
    }

    return 0;
}

// } Driver Code Ends