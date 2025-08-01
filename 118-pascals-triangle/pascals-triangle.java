class Solution {
    public List<List<Integer>> generate(int numRows) { // Our method takes the number of rows we want and returns the triangle
        List<List<Integer>> triangle = new ArrayList<>(); // The main list that will store the entire triangle row by row

        for (int i = 0; i < numRows; i++) { // Loop through each row, building it from top to bottom
            List<Integer> row = new ArrayList<>(); // Create a new list to represent the current row
            row.add(1); // Every row starts with 1, always! Like the top of the pyramid.

            if (i > 0) { // For rows after the first one (i=0), we need to calculate the middle numbers
/*
why 0?
java.lang.IndexOutOfBoundsException: Index -1 out of 
bounds for length 0 
*/
                List<Integer> prevRow = triangle.get(i - 1); // Get the previous row to use for calculation
                for (int j = 1; j < i; j++) { // Loop through the middle elements of the current row (excluding the first and last 1)
                    row.add(prevRow.get(j - 1) + prevRow.get(j)); // The magic formula! Add the two numbers above us in the previous row
                }
                row.add(1); // Every row ends with 1, always! Like the other edge of the pyramid
            }

            triangle.add(row); // Add the completed row to the triangle
        }
        return triangle; // Return the finished Pascal's Triangle
    }
}