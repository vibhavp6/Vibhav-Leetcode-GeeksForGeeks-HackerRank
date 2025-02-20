//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            ArrayList<Double> ans = ob.getMedian(nums);
            for (double i : ans) {
                System.out.printf("%.1f ", i);
            }
            System.out.println();
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    private void insertIntoHeaps(int num, PriorityQueue <Integer> min, PriorityQueue <Integer> max){
        if (max.isEmpty() || num <= max.peek()){
            max.add(num);
        }else{
            min.add(num);
        }
        
        if (max.size() > min.size() + 1){
            min.add(max.poll());
        }else if (max.size() < min.size()){
            max.add(min.poll());
        }
    }
    
    public ArrayList<Double> getMedian(int[] arr) {
        PriorityQueue <Integer> min = new PriorityQueue<>();
        PriorityQueue <Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        ArrayList<Double> ans = new ArrayList<>();
        
        for (int it: arr){
            insertIntoHeaps(it, min, max);
            
            double mid;
            if (min.size() == max.size()){
                mid = (min.peek() + max.peek()) / 2.0;
            }else{
                mid = max.peek();
            }
            
            ans.add(mid);
        }
        
        return ans;
    }
}