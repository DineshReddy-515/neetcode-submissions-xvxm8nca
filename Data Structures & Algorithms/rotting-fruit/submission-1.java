class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();

        int r=grid.length;
        int c=grid[0].length;
        int fresh=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;

        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        int result=0;

        while(!q.isEmpty()  && fresh>0){
            int size=q.size();

            for(int i=0;i<size;i++){
                int[] arr=q.poll();
                int row=arr[0];
                int col=arr[1];

                for(int[] dir: dirs){
                    int m=row+dir[0];
                    int n=col+dir[1];

                    if(m<0||n<0 || m>=r || n>=c || grid[m][n]!=1){
                        continue;
                    }
                    q.add(new int[]{m,n});
                    fresh--;
                    grid[m][n]=2;
                }
            }
            result++;
        }
        return fresh==0 ? result : -1 ;
        
    }
}
