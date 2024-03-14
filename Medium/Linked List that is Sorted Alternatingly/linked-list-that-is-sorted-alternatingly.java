//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends



class Solution {
   public Node sort(Node head){
       if(head==null) return head;
       Node n=head, q=head;
       int count=1, i=0;
       while(n.next!=null){
           count++;
           n=n.next;
       }
       Integer arr[]=new Integer[count];
       n=head;
       while(i<count){
           arr[i]=n.data;
           n=n.next;
           i++;
       }
       Arrays.sort(arr);
       for(i=0;i<count;i++){
           q.data=arr[i];
           q=q.next;
       }
       return head;
   }
}