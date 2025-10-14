/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> ob =new ArrayList<Integer>();
    int length=0;
    public int nodeSum(Node root, int l, int r) {
        // code here
        traversal(root);
        int sum =0;
        for(int i=0;i<length;i++){
            if(ob.get(i)>=l&&ob.get(i)<=r)
            {
                sum=sum+ob.get(i);
            }
        }
        return sum;
    }
    void traversal(Node root){
        if(root==null) return;
        traversal(root.left);
        ob.add(root.data);
        length++;
        traversal(root.right);
    }
}