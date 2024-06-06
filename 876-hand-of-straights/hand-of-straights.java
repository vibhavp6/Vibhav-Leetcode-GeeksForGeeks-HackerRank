public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // Step 1: Check if grouping is possible
        if (hand.length % groupSize != 0) {
            return false;
        }

        // Step 2: Count the occurrences of each card
        Map<Integer, Integer> count = new HashMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        // Step 3: Sort the unique card values
        int[] sortedKeys = new int[count.size()];
        int index = 0;
        for (int key : count.keySet()) {
            sortedKeys[index++] = key;
        }
        Arrays.sort(sortedKeys);

        // Step 4: Form consecutive groups
        for (int key : sortedKeys) {
            if (count.get(key) > 0) {  // If this card is still available
                int startCount = count.get(key);
                // Check and form a group starting from `key`
                for (int i = key; i < key + groupSize; i++) {
                    if (count.getOrDefault(i, 0) < startCount) {
                        return false;
                    }
                    count.put(i, count.get(i) - startCount);
                }
            }
        }

        // Step 5: Return true if all groups are formed successfully
        return true;
    }
}