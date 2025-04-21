class Solution {
public int numberOfArrays(int[] diff, int lower, int upper) {
    long a = 0, maxima = 0, minima = 0;
    for (int i = 0; i < diff.length; i++) {
        a += diff[i];
        maxima = Math.max(maxima, a);
        minima = Math.min(minima, a);
    }
    return (int) Math.max(0, (upper - lower) - (maxima - minima) + 1);
}
}