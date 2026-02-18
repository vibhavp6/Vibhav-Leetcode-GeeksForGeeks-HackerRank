class Solution {
    static int inversionCount(int arr[]) {
        int n=arr.length;
        int cnt=0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<n;i++) {
            int l=0, h=al.size()-1;
            while(l<=h) {
                int mid = (l+h)/2;
                if (al.get(mid) <= arr[i]) {
                    l = mid+1;
                } else {
                    h = mid-1;
                }
            }
            cnt += (al.size()-l);
            al.add(l, arr[i]);
        }
        return cnt;
    }

}