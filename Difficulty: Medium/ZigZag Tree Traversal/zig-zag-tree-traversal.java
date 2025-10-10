/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        ArrayList<Integer> list2 = new ArrayList<>();
        Queue<Integer> idx = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        list.add(root.data);
        list.add(-1);
        idx.add(list.size()-1);
        
        while(!q.isEmpty()){
            Node n = q.remove();
            if(n == null && !q.isEmpty()){
                q.add(null);
                list.add(-1);
                idx.add(list.size()-1);
            }
            else{
                if(n != null && n.left != null){
                    q.add(n.left);
                    list.add(n.left.data);
                }
                if(n != null && n.right != null){
                    q.add(n.right);
                    list.add(n.right.data);
                }
            }
        }
        
        int k = 0, i = 0;
        while(i < list.size() && !idx.isEmpty()){
            int idx2 = idx.remove();
            if(k % 2 == 0){
                for(int j = i; j < idx2; j++){
                    list2.add(list.get(j));
                }
            }else{
                for(int j = idx2-1; j >= i; j--){
                    list2.add(list.get(j));
                }
            }
            i = idx2+1; k++;
        }
        
        return list2;
    }
}

