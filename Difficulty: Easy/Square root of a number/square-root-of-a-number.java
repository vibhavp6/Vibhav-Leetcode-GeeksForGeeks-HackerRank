//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        long l=1;
        long h=n;
        while(l<=h){
            long mid=(l+h)>>1;
            if(mid*mid==n)return mid;
            else if(mid*mid>n){
                h=mid-1;
            }else {
                l=mid+1;
            }
        }
        return h;
    }
}
