class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1, right = (long) Arrays.stream(ranks).min().getAsInt() * cars * cars;

        while (left < right) {
            long mid = (left + right) / 2;
            if (canRepairAll(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canRepairAll(int[] ranks, int cars, long time) {
        long totalCarsRepaired = 0;
        for (int rank : ranks) {
            totalCarsRepaired += Math.sqrt(time / rank);
            if (totalCarsRepaired >= cars) return true;
        }
        return false;
    }
}