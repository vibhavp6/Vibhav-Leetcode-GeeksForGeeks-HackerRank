class Solution {
    int smallestDivisor(int[] arr, int k) {
    	Arrays.sort(arr);
    	int i=1;
    	int j=arr[arr.length-1];
    	int ans=0;
    	while(i<=j) {
    		int mid=(i+j)>>1;
    		int divValue=check(mid,k, arr);
    		if(divValue>k) {
    			i=mid+1;
    		}else { 
    			ans=mid;
    	    	j=mid-1;       			
    		}
    	}
    	return ans;
    }
    
     int check(int mid, int k, int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			double temp=(double)arr[i]/(double)mid;
			int ftemp=(int)Math.ceil(temp);
			cnt+=ftemp;
		}
		return cnt;
	}
}