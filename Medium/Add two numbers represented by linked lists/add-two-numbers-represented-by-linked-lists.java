//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node num1 = new Node(val);
            Node tail = num1;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node num2 = new Node(val);
            tail = num2;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    
    static Node addTwoLists(Node num1, Node num2){

        Node a = reverse(num1);
        Node b = reverse(num2);
        
        Node temp = new Node(0);
        Node ans = temp;
        
        int carry = 0;
        while(a!=null && b!=null){
            int val = a.data + b.data + carry;
            Node node = new Node((val%10));
            temp.next = node;
            temp = temp.next;
            carry = val/10;
            
            a = a.next;
            b = b.next;
        }
        while(a!=null){
            int val = a.data + carry;
            Node node = new Node((val%10));
            temp.next = node;
            temp = temp.next;
            carry = val/10;
            
            a = a.next;
        }
        while(b!=null){
            int val = b.data + carry;
            Node node = new Node((val%10));
            temp.next = node;
            temp = temp.next;
            carry = val/10;
            
            b = b.next;
        }
        Node node = new Node(carry);
        temp.next = node;
        ans = ans.next;
        Node p = reverse(ans);
        
        while(p.data==0 && p.next!=null){
            p = p.next;
        }
        
        return p;
    }
    public static Node reverse(Node start){
        Node prev = start;
        Node curr = start.next;
        
        prev.next = null;
        
        while(curr!=null){
            Node temp = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}