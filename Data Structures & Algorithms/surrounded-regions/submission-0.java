class Solution {
    private int r,c;
    public void solve(char[][] board) {
        r=board.length;
        c=board[0].length;

        for(int i=0;i<r;i++){
            if(board[i][0]=='O'){
                boundary(board,i,0);
            }
            if(board[i][c-1]=='O'){
                boundary(board,i,c-1);
            }

        }
        for(int i=0;i<c;i++){
            if(board[0][i] == 'O'){
                boundary(board,0,i);
            }
            if(board[r-1][i]=='O'){
                boundary(board,r-1,i);
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='B'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void boundary(char[][] board,int n,int m){
        if(n<0 || m<0 || n>=r || m>=c || board[n][m] != 'O') return;

        board[n][m]='B';
        boundary(board,n+1,m);
        boundary(board,n-1,m);
        boundary(board,n,m+1);
        boundary(board,n,m-1);
    }
}
