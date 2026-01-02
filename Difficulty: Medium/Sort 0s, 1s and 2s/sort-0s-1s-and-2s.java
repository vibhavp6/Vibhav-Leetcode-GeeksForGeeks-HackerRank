class Solution {
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int zero=count(arr,0);
        int one=count(arr,1);
        int two=count(arr,2);
        int i=0;
        while(zero>0){
            arr[i++]=0;
            zero--;
        }
        while(one>0){
            arr[i++]=1;
            one--;
        }
        while(two>0){
            arr[i++]=2;
            two--;
        }
    }
    private int count(int[] a,int val){
        int res=0;
        for(int i:a){
            if(i==val) res++;
        }
        return res;
    }
}