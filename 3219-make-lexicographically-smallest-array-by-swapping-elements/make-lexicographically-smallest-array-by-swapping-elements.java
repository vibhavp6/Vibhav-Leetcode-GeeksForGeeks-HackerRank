class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        int[] res=new int[n];

        // Create a 2D array to store each number with its original index
        int[][] numsSort= new int[n][];
        for(int i=0; i<n; i++){
            numsSort[i]=new int[]{nums[i], i};
        }
        
        // Sort the array based on the numbers
        Arrays.sort(numsSort, (a,b)->a[0]-b[0]);

        // Map to store groups of numbers within the limit
        Map<Integer, Deque<Integer>> map=new HashMap<>();

        // Array to store group number for each original index
        int[] grpArr=new int[n];
        int grpNo=0;

        // Initialize the first group with the first element
        grpArr[numsSort[0][1]]=grpNo;
        map.put(grpNo, new ArrayDeque<>());
        map.get(grpNo).addLast(numsSort[0][0]);


        // Group numbers that are within the limit of each other
        for(int i=1; i<n; i++){
            if(numsSort[i][0]-map.get(grpNo).getLast()<=limit){
                // Add to current group if within limit
                map.get(grpNo).addLast(numsSort[i][0]);
                grpArr[numsSort[i][1]]=grpNo;
            }
            else{
                // Start a new group if beyond limit
                grpNo++;
                map.put(grpNo, new ArrayDeque<>());
                map.get(grpNo).addLast(numsSort[i][0]);
                grpArr[numsSort[i][1]]=grpNo;
            }
        }


        // Construct the result array
        for(int i=0; i<n; i++){
            // Assign the smallest available number from each group
            res[i]=map.get(grpArr[i]).pollFirst();
        }

        return res;
    }
}