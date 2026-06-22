class Solution {
    public int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res=new ArrayList<>();
        if(heights==null || heights.length==0 || heights[0].length==0) return res;
        
        int r=heights.length, c=heights[0].length;
        boolean[][] pacific=new boolean[r][c];
        boolean[][] atlantic=new boolean[r][c];
        
        for(int i=0;i<c;i++){
            solve(heights,0,i,Integer.MIN_VALUE,pacific);
            solve(heights,r-1,i,Integer.MIN_VALUE,atlantic);
        }
        for(int i=0;i<r;i++){
            solve(heights,i,0,Integer.MIN_VALUE,pacific);
            solve(heights,i,c-1,Integer.MIN_VALUE,atlantic);
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;

    }
    public void solve(int[][] heights,int i,int j,int prev,boolean[][] ocean){
        if(i<0 || j<0 || i>=heights.length || j>=heights[0].length ) return ;

        if(ocean[i][j] || heights[i][j] < prev) return;

        ocean[i][j]=true;
        for(int[] d: dir){
            solve(heights,i+d[0],j+d[1],heights[i][j],ocean);
        }
    }
}
