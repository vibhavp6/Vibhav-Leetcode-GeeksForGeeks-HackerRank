class Solution {
    public int thirdMax(int[] arr) {
        int temp = -1;
		TreeSet <Integer> ss = new TreeSet<>();
		for (int num : arr) {
			ss.add(num);
		}
		if (ss.size() <3) return ss.last();
		int get = ss.last();
		ss.remove(get);
		int vib  = ss.last();
        ss.remove(vib);
        temp = ss.last();
		return temp;
    }
}