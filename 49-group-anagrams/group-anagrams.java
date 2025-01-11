class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        
        for (String w : strs) {
            char[] s = w.toCharArray();
            Arrays.sort(s);
            String v = new String(s);
            
            if (!mp.containsKey(v)) {
                mp.put(v, new ArrayList<>());
            } 
            mp.get(v).add(w);
        }
        
        return new ArrayList<>(mp.values());
    }
}