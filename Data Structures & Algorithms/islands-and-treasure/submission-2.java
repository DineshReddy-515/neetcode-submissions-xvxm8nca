class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();

        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }

        if(q.size()==0) return;
        int[][] dirs={{1,0},{-1,0},{0,-1},{0,1}};

        while(!q.isEmpty()){
            int[] arr=q.poll();
            int row=arr[0];
            int col=arr[1];
            for(int[] dir : dirs){
                int m=row+dir[0];
                int n=col+dir[1];
                if(m<0 || n<0 || m>=r || n>=c || grid[m][n] != Integer.MAX_VALUE){
                    continue;
                }
                q.add(new int[]{m,n});
                grid[m][n]=grid[row][col]+1;
            }

        }
        
    }
}
