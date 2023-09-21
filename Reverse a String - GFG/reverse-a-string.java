//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String vib)
    {
        char [] store = vib.toCharArray();
        int i = 0 , j =store.length-1;
        while (i <j) {
            char temp =  store[i];
            store[i] = store[j];
            store[j] = temp;
            i++;
            j--;
        }
        return new String (store);
    }
}