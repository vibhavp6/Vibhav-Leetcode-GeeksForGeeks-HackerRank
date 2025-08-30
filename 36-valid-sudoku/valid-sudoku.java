class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        List<HashSet<Integer>> listRow = new ArrayList<>();
        List<HashSet<Integer>> listCol = new ArrayList<>();
        List<HashSet<Integer>> listBox = new ArrayList<>();

        int boxNumber = 0;
        for(int i = 0; i < 9; i++){
            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> col = new HashSet<>();
            HashSet<Integer> box = new HashSet<>();
            listRow.add(row);
            listCol.add(col);
            listBox.add(box);
        }
        for(int row = 0; row < 9 && isValid; row++){
            for(int col = 0; col < 9 && isValid; col++){
                if(board[row][col] != '.') {
                    boxNumber = getBoxNumber(row, col);
                    int value = board[row][col] - '0';
                    if (listRow.get(row).contains(value)) {
                        isValid = false;
                    } else {
                        listRow.get(row).add(value);
                    }
                    if (listCol.get(col).contains(value)) {
                        isValid = false;
                    } else {
                        listCol.get(col).add(value);
                    }
                    if (listBox.get(boxNumber).contains(value)) {
                        isValid = false;
                    } else {
                        listBox.get(boxNumber).add(value);
                    }
                }
            }
        }
        return isValid;
    }

    private static int getBoxNumber(int row, int col) {
        row = row/3;
        col = col/3;
        return row*3+col;
    }
}