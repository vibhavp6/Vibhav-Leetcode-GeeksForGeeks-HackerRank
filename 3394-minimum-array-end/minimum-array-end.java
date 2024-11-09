import java.util.*;

class Solution {
    public long minEnd(int vib, int solum) {
        long answer = solum;
        long dd = 1;
        List<Integer> lik = new ArrayList<>();
        
        for (int i = 0; i < 63; i++) {
            if (((answer >> i) & dd) != dd) {
                lik.add(i);
            }
        }
        
        int limit = lik.size();
        for (long i = 0; i < (dd << limit); i++) {
            if (--vib == 0) {
                for (int j = 0; j < 63; j++) {
                    if (((i >> j) & dd) == dd) {
                        answer |= (dd << lik.get(j));
                    }
                }
                return answer;
            }
        }
        
        return answer;
    }
}
