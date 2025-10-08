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

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
class Solution {

    static Node constructTreeUtil(int[] pre, int[] post, int[] preIndex, 
                                                    int l, int h, int size) {
        if (preIndex[0] >= size || l > h)
            return null;
    
        Node root = new Node(pre[preIndex[0]++]);
    
        if (l == h)
            return root;
    
        int i;
        for (i = l; i <= h; i++)
            if (pre[preIndex[0]] == post[i])
                break;
    
        if (i <= h) {
           
            root.left = constructTreeUtil(pre, post, preIndex, l, i, size);
            root.right = constructTreeUtil(pre, post, preIndex, i + 1, h - 1, size);
        }
    
        return root;
    }
    
    static Node constructTree(int[] pre, int[] post) {
        int[] preIndex = { 0 };
        int size = pre.length;
        return constructTreeUtil(pre, post, preIndex, 0, size - 1, size);
    }

    static int getHeight( Node root, int h ) {
        if( root == null ) return h-1;
        
        return Math.max(getHeight(root.left, h+1), getHeight(root.right, h+1));
    }
    
    static void levelOrder(Node root) {
        Queue<List<Object>> queue = new LinkedList<>();
        queue.offer(List.of(root, 0));
        
        int lastLevel = 0;
        
        int height = getHeight(root, 0);
        
        while( !queue.isEmpty()) {
            List<Object> top = queue.poll();
            
            Node node = (Node) top.get(0);
            int lvl = (int) top.get(1);
            
            if( lvl > lastLevel ) {
                System.out.println();
                lastLevel = lvl;
            }
            
            if( lvl > height ) break;
            
            // System.out.print((node.data == -1 ? "N" : node.data) + " ");
            
            if( node.data == -1 ) continue;
            
            if( node.left == null ) queue.offer(List.of(new Node(-1), lvl+1));
            else queue.offer(List.of(node.left, lvl+1));
            
            if( node.right == null ) queue.offer(List.of(new Node(-1), lvl+1));
            else queue.offer(List.of(node.right, lvl+1));
        }
    }
}