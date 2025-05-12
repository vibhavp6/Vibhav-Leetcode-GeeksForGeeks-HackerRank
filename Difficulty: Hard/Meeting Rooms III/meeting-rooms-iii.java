//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of rooms
            int m = sc.nextInt(); // Number of meetings
            int[][] meetings = new int[m][2];
            for (int i = 0; i < m; i++) {
                meetings[i][0] = sc.nextInt(); // Start time
                meetings[i][1] = sc.nextInt(); // End time
            }
            Solution ob = new Solution();
            System.out.println(ob.mostBooked(n, meetings));
            System.out.println("~");
        }
        sc.close();
    }
}


// } Driver Code Ends

// User function Template for Java
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        // code here
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            availableRooms.offer(i);
        }
        // int[] strtcture {Meeting End Time, Room Number}
        PriorityQueue<int[]> busyRooms = new PriorityQueue<>((a, b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        
        int[] roomCount = new int[n];
        for(int[] meeting: meetings){
            int start = meeting[0];
            int end = meeting[1];
            int duration = end - start;
            int room;
            while(!busyRooms.isEmpty() && busyRooms.peek()[0]<=start){
                availableRooms.offer(busyRooms.poll()[1]);
            }
            if(!availableRooms.isEmpty()){
                room = availableRooms.poll();
                busyRooms.offer(new int[]{end, room});
            }
            // Wait for room to be free
            else{
                int[] next = busyRooms.poll();
                room = next[1];
                int newEnd = next[0] + duration;
                busyRooms.offer(new int[]{newEnd, room});
            }
            roomCount[room]++;
        }
        int maxCount = roomCount[0];
        int maxRoom = 0;
        for(int i=1; i<n; i++){
            if(roomCount[i]>maxCount){
                maxCount = roomCount[i];
                maxRoom = i;
            }   
        }
        return maxRoom;
    }
}


//{ Driver Code Starts.
// } Driver Code Ends