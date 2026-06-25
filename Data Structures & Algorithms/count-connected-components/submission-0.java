class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        boolean[] vis=new boolean[n];

        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,list,vis);
                count++;
            }
        }
        return count;
    }
    public void dfs(int node,List<List<Integer>> list,boolean[] vis){
        if(vis[node]) return;
        vis[node]=true;

        for(int nei : list.get(node)){
            if(!vis[nei]) dfs(nei,list,vis) ;
        }
    }
}
