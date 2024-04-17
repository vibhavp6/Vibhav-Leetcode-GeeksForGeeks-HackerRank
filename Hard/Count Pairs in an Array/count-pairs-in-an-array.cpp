//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution{
    public:
    int merge(int arr[], int st, int mid, int en, int n){
        int n1 = mid-st+1;
        int n2 = en-mid;
        vector<int> v1(n1); // left array
        vector<int> v2(n2); // right array
        
        int cnt = 0;
        int k = 0;
        
        for(int i=st; i<=mid; i++){
            v1[k++] = arr[i];
        }
        k = 0;
        for(int i=mid+1; i<=en; i++){
            v2[k++] = arr[i];
        }
        
        k = st;
        
        int pt1 = 0, pt2 = 0;
        while(pt1<n1 && pt2<n2){
            if(v1[pt1]>v2[pt2]){
                arr[k++] = v2[pt2];
                cnt += n1-pt1; // adding number of times v2[pt2] can be less than elements in the left
                pt2++;
            }
            else{
                arr[k++] = v1[pt1]; 
                pt1++;
            }
        }
        
        while(pt1<n1){
            arr[k++] = v1[pt1];
            pt1++;
        }
        while(pt2<n2){
            arr[k++] = v2[pt2];
            pt2++;
        }
        
        return cnt;
        
    }
    
    int mergeSort(int arr[], int n, int l, int r){
        if(l>=r) return 0;
        
        int mid = (l+r)/2;
        int cnt = 0;
        
        cnt += mergeSort(arr, n, l, mid);
        cnt += mergeSort(arr, n, mid+1, r);
        cnt += merge(arr, l, mid, r, n);
        
        return cnt;
    }
    
    int countPairs(int arr[] , int n ) 
    {
        // Your code goes here  
        for(int i=0; i<n; i++){
            arr[i] *= i;
        }
        
        int ans = mergeSort(arr, n, 0, n-1);
        return ans;
    }
};

//{ Driver Code Starts.
// Driver code
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
    	int n;
    	cin>>n;
    	int a[n];
    	for(int i=0;i<n;i++)
    	cin>>a[i];
    	Solution ob;
    	cout<<ob.countPairs(a, n)<<endl;
    }
}
// } Driver Code Ends