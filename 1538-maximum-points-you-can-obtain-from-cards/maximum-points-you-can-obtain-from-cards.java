class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0;
        int maxScore = 0;

        // Take the first k cards from the left
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        maxScore = leftSum;
        int rightPointer = cardPoints.length - 1;

        // Try taking some cards from the right, reducing from the left
        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightPointer];
            rightPointer--;

            maxScore = Math.max(maxScore, leftSum + rightSum);
        }

        return maxScore;
    }
}