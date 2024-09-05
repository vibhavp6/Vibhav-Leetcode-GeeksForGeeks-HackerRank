class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int rollSum = mean * (m + n);
        for(var rollVal : rolls){
            rollSum -= rollVal;
        }
        if(rollSum < 0)return new int[]{};
        int faceVal = rollSum / n;
        int facesGettingExtra = rollSum % n;
        if(faceVal == 0 || faceVal + ((facesGettingExtra > 0) ? 1 : 0) > 6)return new int[]{};
        int nRolls[] = new int[n];
        for(int indx = 0; indx < n; indx++){
            nRolls[indx] = faceVal;
            if(facesGettingExtra-->0)nRolls[indx]++;
        }
        return nRolls;
    }
}