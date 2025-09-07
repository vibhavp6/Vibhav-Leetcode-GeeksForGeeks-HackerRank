/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
           // Add your code here.
        List<Integer> list = new ArrayList<>() ; 
        for(int i = 0 ; i<arr.length; i++){
           Node temp = arr[i];
           while(temp!= null){
               list.add(temp.data);
               temp = temp.next ; 
           }
        }
        Collections.sort(list) ; 
        Node head = new Node(0) ; 
        Node temp = head ; 
        int i = 0 ; 
        while(i<list.size()){
            temp.next = new Node(list.get(i));
             temp = temp.next ; 
             i++ ; 
        }
        return head.next ; 
    }
}

