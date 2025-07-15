class Solution {
    public boolean divby13(String s) {
        // code here
        int rem=0;
        int i=0;
        int n=s.length();
        while(i<n)
        {
            char ch=s.charAt(i);
            int digit=ch-'0';
            rem=(rem*10+digit)%13;
            i++;
        }
        return rem==0;
    }
}