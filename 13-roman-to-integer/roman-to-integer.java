class Solution {
    public int romanToInt(String s) {
        int currVal = 0;
        int prevVal = 0;
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I' :
                    currVal = 1;
                    break;
                case 'V' :
                    currVal = 5;
                    break;
                case 'X' :
                    currVal = 10;
                    break;
                case 'L' :
                    currVal = 50;
                    break;
                case 'C' :
                    currVal = 100;
                    break;
                case 'D' :
                    currVal = 500;
                    break;
                case 'M' :
                    currVal = 1000;
                    break;
            }
            if(currVal < prevVal) {
                res -= currVal;
            } else {
                res += currVal;
            }
            prevVal = currVal;
        }
        return res;
    }
}