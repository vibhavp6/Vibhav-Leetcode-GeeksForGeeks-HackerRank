class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for(auto i:words){
            string s=i;  // store the string s 
            reverse(s.begin(),s.end());  //reverse it example string i=`aba` reverse it s='aba' is i and s is same then this is a palindrome
            if(s==i){
                return s;
            }
        }
        return "";
    }
};