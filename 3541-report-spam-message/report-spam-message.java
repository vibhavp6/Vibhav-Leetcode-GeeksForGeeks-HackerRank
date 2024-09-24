class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashMap <String, Integer> ans  = new HashMap<>();
        int flag = 0;
        for (String c: bannedWords) {
            ans.put(c, ans.getOrDefault(c,0) +1) ;
        }


        for (String c : message) {
            if (ans.containsKey(c)){
                flag++;
            }
        }

        if (flag >1) {
            return true;
        }
        return false;
    }
}