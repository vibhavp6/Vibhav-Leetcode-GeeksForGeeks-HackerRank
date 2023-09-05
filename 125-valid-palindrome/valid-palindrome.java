class Solution {
    public boolean isPalindrome(String s) {
        //check string is empty or not
        if (s.isEmpty()) {
            return true;
        }
       // setting the pointer to first and last index of the string

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            //if the character at left side is not equal to digit or letter then skip it and move on 
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
             //if the character at right side is not equal to digit or letter then skip it and move on 
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}