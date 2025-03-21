class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Boolean> mp = new HashMap<>();
        List<String> ans = new ArrayList<>();
        boolean rem = true;
        Map<String, List<String>> remain = new HashMap<>();

        for (String s : supplies) {
            mp.put(s, true);
        }

        for (int i = 0; i < recipes.length; i++) {
            String r = recipes[i];
            List<String> l = ingredients.get(i);
            boolean flag = true;

            for (String in : l) {
                if (!mp.containsKey(in))
                    flag = false;
            }
            if (flag) {
                mp.put(r, true);
                ans.add(r);
            } else {
                remain.put(r, l);
            }
        }
        while (rem) {
            rem=false;
            List<String>reupdate=new ArrayList<>();
            for (String x : remain.keySet()) {
                boolean flag = true;
                List<String> l = remain.get(x);
                for (String in : l) {
                    if (!mp.containsKey(in))
                        flag = false;
                }
                if (flag) {
                    mp.put(x, true);
                    ans.add(x);
                    reupdate.add(x);
                    rem=true;
                } 
            }
            for(String y:reupdate){
                remain.remove(y);
            }
        }
        return ans;
    }
}