class Solution {
    public int romanToDecimal(String s) {
        // code here
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = romanMap.get(s.charAt(i));

            if (i + 1 < n) {
                int next = romanMap.get(s.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }

        return result;
    }
}

