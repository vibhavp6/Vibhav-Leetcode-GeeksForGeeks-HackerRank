/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
         Node temp=null;
         temp=head;
         boolean flag=true;
         
         List<Integer> list=new ArrayList<>();
         
         while(temp!=null){
             list.add(temp.data);
             temp=temp.next;
         }
         int j=0;
         
         for(int i=list.size()-1;i>=0;i--){
             int data1=list.get(i);
             int data2=list.get(j);
             
             if(data1!=data2){
                 flag=false;
                 return flag;
             }
             j++;
         }
         
         return flag;
        
    }
}