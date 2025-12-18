class Solution {
    public void sortIt(int[] arr) {
        // code here
        int n=arr.length;
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else odd.add(arr[i]);
        }
        Collections.sort(odd);
        Collections.reverse(odd);
        Collections.sort(even);
        int i=0;
        int j=0;
        while(i<odd.size()){
            arr[j]=odd.get(i);
            i++;
            j++;
        }
        // j++;
        int k=0;
        while(k<even.size()){
            arr[j]=even.get(k);
            k++;
            j++;
        }
        
        
    }
}