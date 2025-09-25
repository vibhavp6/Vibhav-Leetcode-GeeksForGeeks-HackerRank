class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            String binary = intToBinaryBitwise(i);
            list.add(binary);
        }
        return list;
    }
    
    public static String intToBinaryBitwise(int number) {
        if (number == 0) return "0";
        StringBuilder binary = new StringBuilder();
        int highestBit = 31;
        while (((number >> highestBit) & 1) == 0 && highestBit > 0) {
            highestBit--;
        }
        for (int i = highestBit; i >= 0; i--) {
            int bit = (number >> i) & 1;
            binary.append(bit);
        }
        return binary.toString();
    }
}
