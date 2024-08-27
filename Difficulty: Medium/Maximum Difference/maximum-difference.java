//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()){
                if(stack.peek()>=arr[i])
                    stack.pop();
                else{
                    left[i] = stack.peek();
                    break;
                }
            }
            if(stack.isEmpty())
                left[i] = 0;
            stack.push(arr[i]);
        }
        
        while(!stack.isEmpty())
            stack.pop();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()){
                if(stack.peek()>=arr[i])
                    stack.pop();
                else{
                    right[i] = stack.peek();
                    break;
                }
            }
            if(stack.isEmpty())
                right[i] = 0;
            stack.push(arr[i]);
        }
        
        int max = 0;
        for(int i=0;i<left.length;i++)
            max = Math.max(max,Math.abs(left[i]-right[i]));
        return max;
    }
}
