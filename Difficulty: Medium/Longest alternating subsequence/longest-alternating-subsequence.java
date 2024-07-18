//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
//Back-end complete function Template for Java
class Solution {
    public int alternatingMaxLength(int[] arr) {
        // code 
        Stack<Integer>stack=new Stack<>();
        stack.push(arr[0]);
        int n=arr.length;
        int idx=1;
        while(idx<n&&arr[idx]==arr[0]){
            idx++;
        }
        boolean small=false;
        if(idx<n&&arr[idx]<stack.peek()){
            stack.push(arr[idx]);
        }else{
            small=true;
            if(idx<n)
            stack.push(arr[idx]);
        }
        idx++;
        for(int i=idx;i<n;i++){
            if(small==true){
                if(arr[i]<stack.peek()){
                    stack.push(arr[i]);
                    small=false;
                }else if(arr[i]>stack.peek()){
                    stack.pop();
                    stack.push(arr[i]);
                }
            }else{
                if(arr[i]>stack.peek()){
                    stack.push(arr[i]);
                    small=true;;
                }else if(arr[i]<stack.peek()){
                    stack.pop();
                    stack.push(arr[i]);
                }
            }
        }
        return stack.size();
            
            
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int[] nums = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                nums[i] = Integer.parseInt(s[i]);
            }
            Solution obj = new Solution();
            int ans = obj.alternatingMaxLength(nums);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends