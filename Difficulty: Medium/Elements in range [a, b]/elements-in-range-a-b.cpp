class Solution {
    private:
    int getFirst(vector<int> &arr, int &x){
        int  ans= -1;
        int left=0;
        int right= arr.size()-1;
        while(left<=right){
            //firtrs is to finee the mid;
            int mid= left+(right-left)/2;
            if(arr[mid]>=x){
                ans= mid;
                right= mid-1;
            }
            else{
                left= mid+1;
            }
        }
        return ans;
    }
    int getLAst(vector<int> &arr, int &y){
        int ans=-1;
        int left= 0;
        int right=arr.size()-1;
        while(left<=right){
            int mid= left+(right- left)/2;
            if(arr[mid]<=y){
                ans=mid;
                left= mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return ans;
    }
  public:
    vector<int> cntInRange(vector<int> &arr, vector<vector<int>> &queries) {
            //step one to soert the array
            sort(arr.begin(), arr.end());
            //trraverse through  the querrry
            vector<int> ans;
            for(int i=0; i<queries.size(); i++){
                int x= queries[i][0];
                int y= queries[i][1];
                ///now firnthe first and the last position
                //fin the first and the last occurabce of the lemen;
                int firstLeftOcc= getFirst(arr, x);
                int secondRightOcc= getLAst(arr, y);
                if(firstLeftOcc==-1 or secondRightOcc==-1){
                    ans.push_back(0);
                }
                else{
                    ans.push_back(secondRightOcc-  firstLeftOcc + 1);
                }
            }
            return ans;
        
    }
};