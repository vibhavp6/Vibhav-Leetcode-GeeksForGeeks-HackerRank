class Solution {
    public int maxDistance(String s, int k) {
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;

        int maxDist = 0;

        for (int i = 0; i < s.length(); i++) {
            char dir = s.charAt(i);
            if (dir == 'N') {
                north++;
            } else if (dir == 'S') {
                south++;
            } else if (dir == 'E') {
                east++;
            } else {
                west++;
            }

            int base = Math.abs(north - south) + Math.abs(east - west);
            int extra = Math.min(2 * k, i + 1 - base);
            int total = base + extra;

            maxDist = Math.max(maxDist, total);
        }

        return maxDist;
    }
}