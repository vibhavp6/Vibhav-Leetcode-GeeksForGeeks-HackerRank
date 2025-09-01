class Solution {

    public static int sumOfModes(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;

        Map<Integer, Integer> mp = new HashMap<>();


        TreeSet<int[]> st = new TreeSet<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        });

        // Build frequency map for the first window
        for (int i = 0; i < k; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Populate the set with initial frequency pairs
        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            st.add(new int[]{x.getValue(), -x.getKey()});
        }

        // Add mode of the first window
        int mode = -st.last()[1];
        sum += mode;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            int out = arr[i - k];
            int in = arr[i];


            int outFreq = mp.get(out);
            st.remove(new int[]{outFreq, -out});

            mp.put(out, outFreq - 1);


            if (mp.get(out) > 0) {
                st.add(new int[]{mp.get(out), -out});
            } else {
                mp.remove(out);
            }

            mp.put(in, mp.getOrDefault(in, 0) + 1);

            st.add(new int[]{mp.get(in), -in});

            mode = -st.last()[1];
            sum += mode;
        }

        return sum;
    }
}