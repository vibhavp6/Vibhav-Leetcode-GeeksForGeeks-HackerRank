/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int ans;
    public int findMedian(Node root) {
        // Code here
        int[] count={0};
        countNodes(root,count);
        int n=count[0];
        count[0]=(n+(n%2))/2;
        ans=0;
        getMedian(root,count);
        return ans;
    }
    void countNodes(Node root, int[] count){
        if(root==null)return;
        countNodes(root.left,count);
        count[0]++;
        countNodes(root.right,count);
    }
    void getMedian(Node root,int[] count){
        if(root==null)return;
        getMedian(root.left,count);
        count[0]--;
        if(count[0]==0){
            ans=root.data;
            return;
        }
        getMedian(root.right,count);
    }
}