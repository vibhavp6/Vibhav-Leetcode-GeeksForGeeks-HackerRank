class Solution {
    public long transfer(TreeSet<Integer> topXSet, TreeSet<Integer> bottomSet, HashMap<Integer,Integer> map, long sum, int x) {
        while(topXSet.size() < x && !bottomSet.isEmpty()) {
            int num = bottomSet.pollFirst();
            sum += ((long)num*map.get(num));
            topXSet.add(num);
        }
        return sum;
    }
    public long delete(TreeSet<Integer> topXSet, TreeSet<Integer> bottomSet, HashMap<Integer,Integer> map, long sum, int num) {
        if(topXSet.contains(num)) {
            sum -= ((long)num*map.get(num));
            topXSet.remove(num);
        } else if(bottomSet.contains(num)) {
            bottomSet.remove(num);
        }
        return sum;
    }
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] ans = new long[n-k+1];
        long sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        Comparator<Integer> comp = new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                int freqA = map.getOrDefault(a,0);
                int freqB = map.getOrDefault(b,0);
                if(freqA != freqB)
                    return Integer.compare(freqB,freqA);
                else
                    return Integer.compare(b,a);
            }
        };
        TreeSet<Integer> topXSet = new TreeSet<>(comp);
        TreeSet<Integer> bottomSet = new TreeSet<>(comp);
        for(int i=0;i<k;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()) {
            bottomSet.add(key);
        }
        sum = transfer(topXSet, bottomSet, map, sum, x);
        ans[0] = sum;
        int l=1,r=k;
        while(r<n) {
            sum = delete(topXSet, bottomSet, map, sum, nums[r]);
            sum = delete(topXSet, bottomSet, map, sum, nums[l-1]);

            map.put(nums[r], map.getOrDefault(nums[r],0)+1);
            map.put(nums[l-1], map.get(nums[l-1]) - 1);
            if(map.get(nums[l-1]) == 0)
                map.remove(nums[l-1]);

            bottomSet.add(nums[r]);
            if(map.containsKey(nums[l-1]))
                bottomSet.add(nums[l-1]);
            
            sum = transfer(topXSet, bottomSet, map, sum, x);

            if(!bottomSet.isEmpty()) {
                int best = bottomSet.first();
                int worst = topXSet.last();
                if(map.get(best) > map.get(worst) || (map.get(best) == map.get(worst) && best > worst) ) {
                    topXSet.remove(worst);
                    bottomSet.remove(best);
                    sum -= ((long)worst*map.get(worst));

                    topXSet.add(best);
                    bottomSet.add(worst);
                    sum += ((long)best*map.get(best));
                }
            }

            ans[l] = sum;
            l++;
            r++;
        }
        return ans;
    }
}