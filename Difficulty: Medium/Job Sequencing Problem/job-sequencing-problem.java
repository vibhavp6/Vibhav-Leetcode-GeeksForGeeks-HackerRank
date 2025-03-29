//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = deadline[i]; 
            arr[i][1] = profit[i];   
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i][0]);
        }
        int slot[] = new int[maxDeadline];  
        Arrays.fill(slot, -1);
        int totJobs = 0;
        int totProfit = 0;
        for (int i = 0; i < n; i++) {
            int deadlineIdx = arr[i][0] - 1;
            while (deadlineIdx >= 0 && slot[deadlineIdx] != -1) {
                deadlineIdx--;
            }
            if (deadlineIdx >= 0) {
                slot[deadlineIdx] = i;
                totJobs++;
                totProfit += arr[i][1];
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(totJobs);
        res.add(totProfit);
        return res;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            String[] deadlineInput = sc.nextLine().trim().split("\\s+");
            int[] deadline =
                Arrays.stream(deadlineInput).mapToInt(Integer::parseInt).toArray();

            String[] profitInput = sc.nextLine().trim().split("\\s+");
            int[] profit =
                Arrays.stream(profitInput).mapToInt(Integer::parseInt).toArray();
            Solution obj = new Solution();
            ArrayList<Integer> result = obj.jobSequencing(deadline, profit);
            System.out.println(result.get(0) + " " + result.get(1));
            System.out.println("~");
        }

        sc.close();
    }
}
// } Driver Code Ends