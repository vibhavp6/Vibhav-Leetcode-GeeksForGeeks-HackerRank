//{ Driver Code Starts
//Initial Template for C++


#include <bits/stdc++.h>
using namespace std;
#define MAX_HEIGHT 100000

// Tree Node
struct Node {
    int data;
    Node* left;
    Node* right;
};

// Utility function to create a new Tree Node
Node* newNode(int val) {
    Node* temp = new Node;
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;

    return temp;
}


// Function to Build Tree
Node* buildTree(string str) {
    // Corner Case
    if (str.length() == 0 || str[0] == 'N') return NULL;

    // Creating vector of strings from input
    // string after spliting by space
    vector<string> ip;

    istringstream iss(str);
    for (string str; iss >> str;) ip.push_back(str);

    // Create the root of the tree
    Node* root = newNode(stoi(ip[0]));

    // Push the root to the queue
    queue<Node*> queue;
    queue.push(root);

    // Starting from the second element
    int i = 1;
    while (!queue.empty() && i < ip.size()) {

        // Get and remove the front of the queue
        Node* currNode = queue.front();
        queue.pop();

        // Get the current node's value from the string
        string currVal = ip[i];

        // If the left child is not null
        if (currVal != "N") {

            // Create the left child for the current node
            currNode->left = newNode(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->left);
        }

        // For the right child
        i++;
        if (i >= ip.size()) break;
        currVal = ip[i];

        // If the right child is not null
        if (currVal != "N") {

            // Create the right child for the current node
            currNode->right = newNode(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }

    return root;
}


// } Driver Code Ends
/* Tree node structure  used in the program

struct Node {
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};*/

class Solution{
    public:
    int res = 1;
    vector<int> rec( Node* root ){
        vector<int> l = {1,0,INT_MIN,INT_MAX}, r = {1,0,INT_MIN,INT_MAX};
        if ( root->left ) l = rec(root->left);
        if ( root->right ) r = rec(root->right);
        if ( l[0] != -1 && r[0] != -1 && l[2] < root->data && r[3] > root->data ){
            res = max(res, l[1]+r[1]+1);
            if ( l[2] == INT_MIN && l[3] == INT_MAX ){
                l[2] = root->data; l[3] = root->data;
            }
            if ( r[2] == INT_MIN && r[3] == INT_MAX ){
                r[2] = root->data; r[3] = root->data;
            }
            return {1, l[1]+r[1]+1, max({root->data,l[2],l[3],r[2],r[3]}), 
                                min({root->data,l[2],l[3],r[2],r[3]})};
        } else return {-1, l[1]+r[1]+1, max({root->data,l[2],l[3],r[2],r[3]}), 
                                min({root->data,l[2],l[3],r[2],r[3]})};
    }
    int largestBst(Node *root){
        rec(root); return res;
    }
};

//{ Driver Code Starts.

/* Driver program to test size function*/

  

int main() {

   
    int t;
    scanf("%d ", &t);
    while (t--) {
        string s, ch;
        getline(cin, s);
        
        Node* root = buildTree(s);
        Solution ob;
        cout << ob.largestBst(root) << endl;
    }
    return 0;
}

// } Driver Code Ends