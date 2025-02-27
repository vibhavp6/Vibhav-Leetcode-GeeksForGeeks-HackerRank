//{ Driver Code Starts
import java.util.*;

class Get_Min_From_Stack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int q = sc.nextInt(); // Number of queries
            Solution g = new Solution();

            while (q-- > 0) {
                int qt = sc.nextInt();

                if (qt == 1) {
                    int att = sc.nextInt();
                    g.push(att);
                } else if (qt == 2) {
                    g.pop(); // Just call pop(), do not print anything
                } else if (qt == 3) {
                    System.out.print(g.peek() + " "); // Print top element
                } else if (qt == 4) {
                    System.out.print(g.getMin() + " "); // Print minimum element
                }
            }
            System.out.println("\n~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    Stack<Integer> st;
    int min;
    public Solution() {
        st=new Stack<>(); 
        min=-1;
    }

    // Add an element to the top of Stack
    public void push(int x) {
        if(st.size()==0){
            st.push(x);
            min=x;
        }else {
            if(x<min){
                int temp=2*x-min;
                st.push(temp);
                min=x;
            }else{
                st.push(x);
            }
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        if(st.size()==0)return;
        else {
            int temp=st.pop();
            if(temp>=min)return;
            else {
                int ans=min;
                min=2*min-temp;
            }
        }
    }
    

    // Returns top element of the Stack
    public int peek() {
        if(st.size()==0)return -1;
        else {
            int temp=st.peek();
            if(temp>=min)return temp;
            else {
                return min;
            }
        }
    }

    // Finds minimum element of Stack
    public int getMin() {
        if(st.size()==0)return -1;
        return min;
    }
}