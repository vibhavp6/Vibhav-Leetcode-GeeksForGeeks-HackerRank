//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

class Matrix {
  public:
    template <class T>
    static void input(vector<vector<T>> &A, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                scanf("%d ", &A[i][j]);
            }
        }
    }

    template <class T>
    static void print(vector<vector<T>> &A) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A[i].size(); j++) {
                cout << A[i][j] << " ";
            }
            cout << endl;
        }
    }
};


// } Driver Code Ends

class Solution {
  public:
    bool connection(int check, vector<bool>& visited, vector<vector<int>>& adj) {
        vector<int> checker = adj[check];
        checker.push_back(check);
        sort(checker.begin(), checker.end());
        
        for(auto i : adj[check]) {
            visited[i] = true;
            vector<int> temp = adj[i];
            temp.push_back(i);
            sort(temp.begin(), temp.end());
            if(checker != temp) return false;
        }
        //cout << "Yes"<< endl;
        return true;
    }
    
    int findNumberOfGoodComponent(int e, int v, vector<vector<int>> &edges) {
        int ans = 0;
        vector<bool> visited(v + 1, false);
        vector<vector<int>> adj(v + 1, vector<int>());
        //cout << "debug"<< endl;
        
        for(auto i : edges) {
            int s = i[0];
            int e = i[1];
            
            adj[s].push_back(e);
            adj[e].push_back(s);
        }
        
        for(int i = 1; i <= v; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                bool check = connection(i, visited, adj);
                //cout << "Enter"<< endl;
                if(check) ans++;
            } 
        }
        
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d ", &t);
    while (t--) {

        int e;
        scanf("%d", &e);

        int v;
        scanf("%d", &v);

        vector<vector<int>> edges(e, vector<int>(2));
        Matrix::input(edges, e, 2);

        Solution obj;
        int res = obj.findNumberOfGoodComponent(e, v, edges);

        cout << res << endl;
    }
}

// } Driver Code Ends