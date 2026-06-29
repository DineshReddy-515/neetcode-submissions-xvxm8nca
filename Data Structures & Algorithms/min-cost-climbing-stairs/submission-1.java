class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] res=new int[cost.length];
        Arrays.fill(res,-1);
        return Math.min (solve(cost,0,res),solve(cost,1,res));
        
    }
    public int solve(int[] cost,int i,int[] res){
        if(i>=cost.length) return 0;
        if(res[i] != -1) return res[i];
        return res[i]=cost[i] + Math.min(solve(cost,i+1,res),solve(cost,i+2,res));
    }
}
