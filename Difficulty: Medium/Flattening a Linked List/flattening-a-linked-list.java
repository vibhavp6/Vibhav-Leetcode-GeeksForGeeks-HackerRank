class Solution {
    public Node flatten(Node root) {
        // code here
        Node nextNode = root.next;
        while(nextNode != null){
            Node t = nextNode.next;
            mergeNode(root, nextNode);
            nextNode = t;
        }
        return root;
    }
    
    public void mergeNode(Node a, Node b){
        Node last = null;
        while(a != null){
            if(a.data > b.data){
                switchNode(a, b);
            }
            if(a.bottom == null){
                last = a;
            }
            a = a.bottom;
        }
        last.bottom = b;
    }
    
    public void switchNode(Node a, Node b){
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
        
        while(b.bottom != null && b.data > b.bottom.data){
            temp = b.data;
            b.data = b.bottom.data;
            b.bottom.data = temp;
            b = b.bottom;
        }
    }
}

