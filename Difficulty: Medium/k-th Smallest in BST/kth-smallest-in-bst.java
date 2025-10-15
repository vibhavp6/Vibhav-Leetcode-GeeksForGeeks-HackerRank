/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int ans=-1;
    int kk;
    public int kthSmallest(Node root, int k) {
        kk=k;
        kth(root);
        return ans;
    }
    public void kth(Node root) {
        if(root.left==null && root.right==null){
            kk--;
            
            if(kk==0){
                ans=root.data;
            }
            return;
        }
        if(root.left!=null) kth(root.left);
        kk--;
        if(kk==0) ans=root.data;
        if(root.right!=null) kth(root.right);
        
    }
}