class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        boolean[] vis=new boolean[n];
        boolean return1 = dfs(list,-1,0,vis) ;
        for(int i=0;i<n;i++){
            if(!vis[i]) return false;
        }
        return return1;
    }

    public boolean dfs(List<List<Integer>> list,int prev,int node,boolean[] vis){
        if(vis[node]){
            return false;
        }

        vis[node]=true;
        for(int nei: list.get(node)){
            if(nei==prev) continue;
            
            if(!dfs(list,node,nei,vis)){
                return false;
            }
        }
        return true;
    }

}
