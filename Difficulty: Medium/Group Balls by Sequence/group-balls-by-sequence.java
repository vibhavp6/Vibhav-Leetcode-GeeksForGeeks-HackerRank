public class Solution {
    public boolean validgroup(int[] arr, int k) {
        if (arr.length % k != 0) return false;

        TreeMap<Integer, Integer> countMap = new TreeMap<>();

        // Count frequencies
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            int first = countMap.firstKey();

            for (int i = 0; i < k; i++) {
                int num = first + i;
                if (!countMap.containsKey(num)) {
                    return false;
                }
                countMap.put(num, countMap.get(num) - 1);
                if (countMap.get(num) == 0) {
                    countMap.remove(num);
                }
            }
        }

        return true;
    }
}