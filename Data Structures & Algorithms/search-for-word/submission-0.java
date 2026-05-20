class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    int grid[][]=new int[board.length][board[0].length];
                    if(solve(board,word,grid,i,j,0)) return true;
                }
            }
        }
        return false;
        
    }
    public boolean solve(char[][] board,String word,int[][] grid,int i,int j,int ind){
        if(ind==word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || grid[i][j]==1) return false;

        boolean result=false;
        if(board[i][j]==word.charAt(ind)){
            grid[i][j]=1;
            ind++;
            result= (solve(board,word,grid,i+1,j,ind) ||
            solve(board,word,grid,i-1,j,ind) ||
            solve(board,word,grid,i,j+1,ind) ||
            solve(board,word,grid,i,j-1,ind) );
            grid[i][j]=0;
        }
        
        return result;
        
    }
}
