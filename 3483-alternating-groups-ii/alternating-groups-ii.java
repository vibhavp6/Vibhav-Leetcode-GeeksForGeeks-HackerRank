class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        //keep track of most recent index where disruption happened while doing sliding window
        //as long as disruption is outside of the bounds of the sliding window, add 1 to the count
        int L = 0;
        int R = k-1;
        int count = 0;
        int mostRecentDisruptionIdx = -1;
        for(int i = 1; i <= R; i++){
            if(colors[i] == colors[i-1])
                mostRecentDisruptionIdx = i-1;
        }
        while(R < colors.length + k-1){
            if(mostRecentDisruptionIdx < L)
                count++;
            R++;
            L++;
            if(R < colors.length + k -1)
                if(colors[R%colors.length] == colors[(R-1)%colors.length])
                    mostRecentDisruptionIdx = R-1;
        }
        return count;
    }
}