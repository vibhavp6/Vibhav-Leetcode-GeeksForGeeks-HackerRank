class Solution {
public:
    int characterReplacement(string s, int k) {
        int st = 0;
        int ans = 0;
        map<char, int> mpp;
        int n = s.size();
        int maxFreq = 0;

        for(int i = 0; i < n; i++){
            mpp[s[i]]++;
            maxFreq = max(mpp[s[i]], maxFreq);

            while(i - st + 1 - maxFreq > k){
                mpp[s[st]]--;

                if(mpp[s[i]] == 0){
                    mpp.erase(mpp[s[i]]);
                }

                st++;
            }

            ans = max(ans, i - st + 1);

        }

        return ans;
    }
};