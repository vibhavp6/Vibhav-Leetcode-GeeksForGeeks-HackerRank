class kQueues {
    List<Queue<Integer>> ls;
    int capacity, currCap;

    kQueues(int n, int k) {
        // Initialize your data members
        capacity = n;
        currCap = 0;
        ls = new ArrayList<>();
        for(int i = 0; i < k; i++)
            ls.add(new LinkedList<>());
    }

    void enqueue(int x, int i) {
        // enqueue element x into queue number i
        ls.get(i).offer(x);
        currCap++;
    }

    int dequeue(int i) {
        // dequeue element from queue number i
        if(ls.get(i).isEmpty()) return -1;
        currCap--;
        return ls.get(i).poll();
    }

    boolean isEmpty(int i) {
        // check if queue i is empty
        return ls.get(i).isEmpty();
    }

    boolean isFull() {
        // check if array is full
        return currCap == capacity;
    }
}