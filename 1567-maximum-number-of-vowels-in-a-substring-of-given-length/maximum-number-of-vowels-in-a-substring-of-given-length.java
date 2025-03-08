class Solution {
    public boolean isVowel(Character ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            return true;
        }

        return false;
    }
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int st = 0;
        int ans = 0;
        int cnt = 0;

        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i)) ){
                cnt++;
            }

            if(i - st + 1 == k){
                ans = Math.max(ans, cnt);

                if(isVowel(s.charAt(st))){
                    cnt--;
                }

                st++;
            }
        }

        return ans;
    }
}