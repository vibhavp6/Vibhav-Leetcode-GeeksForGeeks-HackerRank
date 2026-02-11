class Solution {

    static class Node {
        int l, r;
        int mn, mx;
        int lazy;
    }

    static class SegmentTree {
        Node[] tr;

        SegmentTree(int n) {
            tr = new Node[n << 2];
            for (int i = 0; i < tr.length; i++) {
                tr[i] = new Node();
            }
            build(1, 0, n);
        }

        void build(int u, int l, int r) {
            tr[u].l = l;
            tr[u].r = r;
            tr[u].mn = tr[u].mx = 0;
            tr[u].lazy = 0;
            if (l == r) return;
            int mid = (l + r) >> 1;
            build(u << 1, l, mid);
            build(u << 1 | 1, mid + 1, r);
        }

        void modify(int u, int l, int r, int v) {
            if (tr[u].l >= l && tr[u].r <= r) {
                apply(u, v);
                return;
            }
            pushdown(u);
            int mid = (tr[u].l + tr[u].r) >> 1;
            if (l <= mid) modify(u << 1, l, r, v);
            if (r > mid) modify(u << 1 | 1, l, r, v);
            pushup(u);
        }

        int query(int u, int target) {
            if (tr[u].l == tr[u].r) {
                return tr[u].l;
            }
            pushdown(u);
            int left = u << 1;
            int right = u << 1 | 1;
            if (tr[left].mn <= target && target <= tr[left].mx) {
                return query(left, target);
            }
            return query(right, target);
        }

        void apply(int u, int v) {
            tr[u].mn += v;
            tr[u].mx += v;
            tr[u].lazy += v;
        }

        void pushup(int u) {
            tr[u].mn = Math.min(tr[u << 1].mn, tr[u << 1 | 1].mn);
            tr[u].mx = Math.max(tr[u << 1].mx, tr[u << 1 | 1].mx);
        }

        void pushdown(int u) {
            if (tr[u].lazy != 0) {
                apply(u << 1, tr[u].lazy);
                apply(u << 1 | 1, tr[u].lazy);
                tr[u].lazy = 0;
            }
        }
    }

    public int longestBalanced(int[] nums) {
        int n = nums.length;
        SegmentTree st = new SegmentTree(n);
        Map<Integer, Integer> last = new HashMap<>();
        int now = 0;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int x = nums[i - 1];
            int det = (x & 1) == 1 ? 1 : -1;

            if (last.containsKey(x)) {
                st.modify(1, last.get(x), n, -det);
                now -= det;
            }

            last.put(x, i);
            st.modify(1, i, n, det);
            now += det;

            int pos = st.query(1, now);
            ans = Math.max(ans, i - pos);
        }

        return ans;
    }
}