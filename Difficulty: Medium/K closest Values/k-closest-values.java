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
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.diff == b.diff) {
                return Integer.compare(b.val, a.val);
            }
            return Integer.compare(b.diff, a.diff);
        });
        inOrder(root,pq,target,k);
        ArrayList<Integer> ls = new ArrayList<>();

        while (!pq.isEmpty() && ls.size() != k) {
            ls.add(pq.poll().val);
        }
        return ls;
    }
    public void inOrder(Node root,PriorityQueue<Pair> pq,int target,int k){
        if (root == null) {
            return;
        }
        inOrder(root.left, pq,target,k);
        pq.add(new Pair(root.data, Math.abs(root.data - target)));
        if(pq.size() > k) pq.poll();
        inOrder(root.right, pq, target, k);
    }
    class Pair {
    int val;
    int diff;

    Pair(int val, int diff) {
        this.val = val;
        this.diff = diff;
    }
}
}
 