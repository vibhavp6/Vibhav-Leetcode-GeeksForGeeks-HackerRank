//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        
        //HashMap to map each opening bracket with respective closing bracket
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('{','}');
        hm.put('[',']');
        hm.put('(',')');
        
        //iterating through each character of given string
        for(int i=0;i<x.length();i++){
            //if current char is opening bracket then push to stack
            if(hm.containsKey(x.charAt(i))){
                st.push(x.charAt(i));
            }
            //current is a clsoing bracket
            else{
                //if there is not opening bracket for current closing bracket
                //return false 
                if(!st.isEmpty()){
                    char par = st.pop();
                    //checking if Parenthes is not valid
                    if(x.charAt(i) != hm.get(par)){
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        //if all Parenthesis are valid then stack should be empty
        if(st.isEmpty()){
            return true;
        }
        else
            return false;
    }
}
