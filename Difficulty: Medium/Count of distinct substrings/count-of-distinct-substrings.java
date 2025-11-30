class Solution {

    static class State {
        int len, link;
        int[] next = new int[26];
        State() {
            len = 0;
            link = -1;
            Arrays.fill(next, -1);
        }
    }

    public static int countSubs(String s) {

        int n = s.length();
        State[] st = new State[2 * n];
        int size = 1;
        int last = 0;

        st[0] = new State();

        for (char ch : s.toCharArray()) {
            int c = ch - 'a';
            int cur = size++;
            st[cur] = new State();
            st[cur].len = st[last].len + 1;

            int p = last;

            while (p != -1 && st[p].next[c] == -1) {
                st[p].next[c] = cur;
                p = st[p].link;
            }

            if (p == -1) {
                st[cur].link = 0;
            } else {
                int q = st[p].next[c];
                if (st[p].len + 1 == st[q].len) {
                    st[cur].link = q;
                } else {
                    int clone = size++;
                    st[clone] = new State();
                    st[clone].len = st[p].len + 1;
                    st[clone].link = st[q].link;
                    st[clone].next = st[q].next.clone();

                    while (p != -1 && st[p].next[c] == q) {
                        st[p].next[c] = clone;
                        p = st[p].link;
                    }

                    st[q].link = st[cur].link = clone;
                }
            }

            last = cur;
        }

        long ans = 0;
        for (int i = 1; i < size; i++) {
            ans += st[i].len - st[st[i].link].len;
        }

        return (int) ans;
    }
}