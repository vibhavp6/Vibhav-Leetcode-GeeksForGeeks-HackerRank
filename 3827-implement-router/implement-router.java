import java.util.*;

class Router {
    private static class Packet {
        int source, destination, timestamp;
        Packet(int s, int d, int t) {
            source = s; destination = d; timestamp = t;
        }
    }

    private Deque<Packet> queue; // to maintain order (FIFO)
    private Set<String> seen;    // to avoid duplicates
    private int size;            // memory limit
    private Map<Integer, TreeMap<Integer, Integer>> destToPrefix; // prefix sums per destination

    public Router(int memoryLimit) {
        queue = new ArrayDeque<>();
        seen = new HashSet<>();
        size = memoryLimit;
        destToPrefix = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "#" + destination + "#" + timestamp;
        if (seen.contains(key)) return false;

        // Evict oldest packet if memory full
        if (queue.size() == size) {
            Packet old = queue.pollFirst();
            seen.remove(old.source + "#" + old.destination + "#" + old.timestamp);
            updatePrefix(old.destination, old.timestamp, -1);
        }

        // Add new packet
        Packet p = new Packet(source, destination, timestamp);
        queue.offerLast(p);
        seen.add(key);
        updatePrefix(destination, timestamp, 1);
        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) return new int[] {};

        Packet p = queue.pollFirst();
        seen.remove(p.source + "#" + p.destination + "#" + p.timestamp);
        updatePrefix(p.destination, p.timestamp, -1);
        return new int[] { p.source, p.destination, p.timestamp };
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!destToPrefix.containsKey(destination)) return 0;

        TreeMap<Integer, Integer> prefix = destToPrefix.get(destination);

        // cumulative count up to endTime
        Map.Entry<Integer, Integer> endEntry = prefix.floorEntry(endTime);
        int endCount = (endEntry == null) ? 0 : endEntry.getValue();

        // cumulative count up to (startTime - 1)
        Map.Entry<Integer, Integer> startEntry = prefix.floorEntry(startTime - 1);
        int startCount = (startEntry == null) ? 0 : startEntry.getValue();

        return endCount - startCount;
    }

    // Update prefix sums when inserting or deleting a packet
    private void updatePrefix(int dest, int time, int delta) {
        destToPrefix.putIfAbsent(dest, new TreeMap<>());
        TreeMap<Integer, Integer> prefix = destToPrefix.get(dest);

        // Base cumulative count
        int newCount = delta;
        Map.Entry<Integer, Integer> prev = prefix.floorEntry(time);
        if (prev != null) newCount += prev.getValue();

        prefix.put(time, newCount);

        // Update all later entries
        NavigableMap<Integer, Integer> tail = prefix.tailMap(time, false);
        List<Integer> keys = new ArrayList<>(tail.keySet());
        for (int k : keys) {
            prefix.put(k, prefix.get(k) + delta);
        }
    }
}