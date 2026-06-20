class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0) return result;
        List<Integer> list=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        solve(nums,result,list,vis);

        return result;
    }
    public void solve(int[] nums,List<List<Integer>> result, List<Integer> list, boolean[] vis){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                list.add(nums[i]);
                vis[i]=true;
                solve(nums,result,list,vis);
                vis[i]=false;
                list.remove(list.size()-1);
            }
            
        }
    }
}
