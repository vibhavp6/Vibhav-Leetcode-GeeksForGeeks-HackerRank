class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedMeetings = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (mergedMeetings.isEmpty() || meeting[0] > mergedMeetings.get(mergedMeetings.size() - 1)[1]) {
                mergedMeetings.add(meeting);
            } else {
                mergedMeetings.get(mergedMeetings.size() - 1)[1] = 
                    Math.max(mergedMeetings.get(mergedMeetings.size() - 1)[1], meeting[1]);
            }
        }

        int meetingDaysCount = 0;
        for (int[] m : mergedMeetings) {
            meetingDaysCount += (m[1] - m[0] + 1);
        }

        return days - meetingDaysCount;
    }
}