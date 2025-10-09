/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> postOrder(Node root) {
       ArrayList<Integer> postorder = new ArrayList<>();
        if(root==null)return postorder;
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            root=stack1.pop();
            stack2.push(root);
            if(root.left!=null)stack1.push(root.left);
            if(root.right!=null)stack1.push(root.right);
        }
        while(!stack2.isEmpty())postorder.add(stack2.pop().data);
        return postorder;
    }
}