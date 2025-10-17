/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

class Solution {
    int val =0;
    public void transformTree(Node root) {
        // code here
        if(root==null) return ;
        int value = root.data;
        transformTree(root.right);
        root.data = val;
        val+=value;
        transformTree(root.left);
    }
}