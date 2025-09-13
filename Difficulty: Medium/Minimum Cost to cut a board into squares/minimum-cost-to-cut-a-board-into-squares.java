class Solution {
    public static int minCost(int n, int m, int[] x, int[] y) {
        // code here
        Arrays.sort(x);
        Arrays.sort(y);
        reverse(x);
        reverse(y);
        
        int i = 0, j = 0;
        int total = 0, hp = 1, vp = 1;
        
        while(i < m-1 && j < n-1){
            if(x[i] >= y[j]){
                total += x[i] * hp;
                vp++;
                i++;
            }
            else{
                total += y[j] * vp;
                hp++;
                j++;
            }
        }
        
        while(i < m-1){
            total += x[i] * hp;
            i++;
        }
        while(j < n-1){
            total += y[j] * vp;
            j++;
        }
        
        return total;
    }
    
    static void reverse(int ar[]){
        int i = 0, j = ar.length-1;
        while(i < j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }
}