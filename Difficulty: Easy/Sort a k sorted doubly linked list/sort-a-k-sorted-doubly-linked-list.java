//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class Main {
    public static void push(DLLNode tail, int new_data) {
        DLLNode newNode = new DLLNode(new_data);
        newNode.next = null;
        newNode.prev = tail;

        if (tail != null) {
            tail.next = newNode;
        }
    }

    public static void printList(DLLNode head) {
        if (head == null) {
            return;
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] arr = br.readLine().trim().split(" ");
            int k = Integer.parseInt(br.readLine().trim());

            DLLNode head = new DLLNode(Integer.parseInt(arr[0]));
            DLLNode tail = head;

            for (int i = 1; i < arr.length; i++) {
                push(tail, Integer.parseInt(arr[i]));
                tail = tail.next;
            }

            Solution obj = new Solution();
            DLLNode sorted_head = obj.sortAKSortedDLL(head, k);
            printList(sorted_head);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if(head==null||head.next==null) return head;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        int count=0;
        while(count<=k){
            count++;
            pq.add(head.data);
            head=head.next;
            if(head==null){
                DLLNode h=new DLLNode(pq.poll());
                DLLNode temp=h;
                //DLLNode prev=null;
                
                while(!pq.isEmpty()) {
                    DLLNode nn=new DLLNode(pq.poll());
                    //prev=temp;
                    temp.next=nn;
                    nn.prev=temp;
                    temp=temp.next;
                }
                return h;
            }
            
        }
        DLLNode h=new DLLNode(pq.poll());
        DLLNode temp=h;
        while(head!=null){
            pq.add(head.data);
            DLLNode nn=new DLLNode(pq.poll());
            temp.next=nn;
            nn.prev=temp;
            temp=temp.next;
            head=head.next;
        }
        while(!pq.isEmpty()) {
                    DLLNode nn=new DLLNode(pq.poll());
                    //prev=temp;
                    temp.next=nn;
                    nn.prev=temp;
                    temp=temp.next;
                }
                return h;
    }
}

