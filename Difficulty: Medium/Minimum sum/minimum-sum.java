class Solution {
    String minSum(int[] arr) {
        // code here
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int start = 0;
        // To avoid multiple zeroes in arr
        while(start < n && arr[start] == 0) {
            start++;
        }
        
        
        StringBuilder res = new StringBuilder();
        
        int i=n-1;
        int sum, carry = 0;
        while(i>start) {
            sum = arr[i] + arr[i-1] + carry;
            res.append(sum % 10);
            
            carry = sum/10;
            
            i-=2;
        }
        if(i == start) {
            sum = arr[start] + carry;
            res.append(sum%10);
            carry = sum/10;
        }
        if(carry > 0) {
            res.append(carry);
        }
        
        res.reverse();
        return res.toString();
    }
}
