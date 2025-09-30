class Solution {
  public ArrayList<String> binstr(int n) {
    int target = (int) Math.pow(2, n);
    ArrayList<String> res = new ArrayList<>();
    for (int i = 0; i < target; ++i) {
      String binStr = Integer.toBinaryString(i);
      binStr = "0".repeat(n - binStr.length()) + binStr;
      res.add(binStr);
    }
    return res;
  }
}
