//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    public List<Integer> findMajority(List<Integer> nums) {
    // Function to find the majority elements in the array
     List<Integer>list = new ArrayList<Integer>();
        Collections.sort(nums);
        int n = nums.size()/3;
        int prev=nums.get(0);
        int count =1;
        for(int i=1;i<nums.size();i++){
            if(prev==nums.get(i)){
                count++;
                prev=nums.get(i);
            }
            else{
                if(count>n){
                   list.add(prev) ;
                }
                count =1;
                prev = nums.get(i);
            }
        }
         if(count>n)
            list.add(prev);
        return list.isEmpty()?Arrays.asList(-1):list;
    }
}
