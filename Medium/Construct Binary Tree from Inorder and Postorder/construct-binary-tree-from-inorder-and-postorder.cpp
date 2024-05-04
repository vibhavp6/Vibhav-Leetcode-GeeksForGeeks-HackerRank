//{ Driver Code Starts
/* program to construct tree using inorder and postorder traversals */
#include <bits/stdc++.h>
using namespace std;

/* A binary tree node has data, pointer to left child
   and a pointer to right child */
struct Node {
    int data;
    struct Node* left;
    struct Node* right;

    Node(int x) {
        data = x;
        left = right = NULL;
    }
};

/* This funtcion is here just to test buildTreeUtil() */
void preOrder(Node* node) {
    if (node == NULL) return;

    /* then print the data of node */
    printf("%d ", node->data);

    /* first recur on left child */
    preOrder(node->left);

    /* now recur on right child */
    preOrder(node->right);
}


// } Driver Code Ends
/* Tree node structure

struct Node
{
    int data;
    struct Node* left;
    struct Node* right;

    Node(int x){
        data = x;
        left = right = NULL;
    }
};*/

class Solution {
public:
    // Recursive function to construct a binary tree from inorder and postorder traversals
    Node* buildTree(int in[], int post[], int n) {
        // Base case: If no nodes, return nullptr
        if (n == 0) {
            return nullptr;
        }

        // Find the root node index in inorder traversal
        int rootIndex = 0;
        while (rootIndex < n && in[rootIndex] != post[n - 1]) {
            rootIndex++;
        }

        // Create the root node with the value from postorder traversal
        Node* root = new Node(post[n - 1]);

        // Recursively build left subtree using elements before root in inorder traversal
        Node* leftSubtree = buildTree(in, post, rootIndex);

        // Recursively build right subtree using elements after root in inorder traversal
        Node* rightSubtree = buildTree(in + rootIndex + 1, post + rootIndex, n - rootIndex - 1);

        // Connect left and right subtrees to the root node
        root->left = leftSubtree;
        root->right = rightSubtree;

        return root;
    }
};


//{ Driver Code Starts.

int main() {
    int t, n;
    cin >> t;
    while (t--) {
        cin >> n;
        int in[n], post[n];
        for (int i = 0; i < n; i++) cin >> in[i];
        for (int i = 0; i < n; i++) cin >> post[i];
        Solution obj;
        Node* root = obj.buildTree(in, post, n);
        preOrder(root);
        cout << endl;
    }
    return 0;
}

// } Driver Code Ends