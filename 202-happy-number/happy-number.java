class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hm = new HashSet<>();
        while(n!=1) {
            if (hm.contains(n)) return false;

            else {
                hm.add(n);
                n = number(n);
            }
        }
        return true;
    }

    static int number(int n) {
        int sum = 0;
        while(n>0) {
            int ld = n%10;
            sum += ld*ld;
            n = n/10;
        }
        return sum;
    }
}