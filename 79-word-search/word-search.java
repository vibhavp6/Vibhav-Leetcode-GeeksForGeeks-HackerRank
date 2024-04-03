class Solution {
    private boolean dfs(int r, int c, int i, boolean[][] visited, char[][] board, String word){
        if(i == word.length()){
            return true;
        }
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length){
            return false;
        }
        if(word.charAt(i) != board[r][c]){
            return false; 
        }
        if(visited[r][c] ){ 
            return false; 
        }
        visited[r][c] = true;
        boolean res = dfs(r + 1, c, i + 1, visited, board, word);
        res = res || dfs(r - 1, c, i + 1, visited, board, word);
        res = res || dfs(r, c + 1, i + 1, visited, board, word);
        res = res || dfs(r, c - 1, i + 1, visited, board, word);
        visited[r][c] = false;
        return res;
    }
    public boolean exist(char[][] board, String word) {
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[0].length; c++){
                boolean[][] visited = new boolean[board.length][board[0].length];
                boolean isFound = dfs(r, c, 0, visited, board, word); 
                if(isFound){ 
                    return true; 
                }
			}
		}
		return false;
    }
}