class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            HashSet<Character> h1=new HashSet<>();
            HashSet<Character> h2=new HashSet<>();
            for(int j=0;j<9;j++){
                
                if(h1.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }else{
                    h1.add(board[i][j]);
                }

                if(h2.contains(board[j][i]) && board[j][i] != '.'){
                    return false;
                }else{
                    h2.add(board[j][i]);
                }
                
            }
        }

        for(int k=0;k<9;k++){
            HashSet<Character> h3=new HashSet<>();

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row=(k/3)*3+i;
                    int col=(k%3)*3+j;
                    if(board[row][col] =='.') continue;
                    if(h3.contains(board[row][col])) return false;
                    h3.add(board[row][col]);
                }
            }
        }






        return true;
    }
}
