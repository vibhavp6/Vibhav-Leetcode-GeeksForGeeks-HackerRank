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
}

*/
class Solution {
    private static boolean isTrue(Node left,Node right){
        if(left==null || right==null)return left==right;
        if(left.data!=right.data)return false;
        return isTrue(left.left,right.right)&&isTrue(left.right,right.left);
    }
    public static boolean isSymmetric(Node root) {
        return root==null || isTrue(root.left,root.right);
    }
}