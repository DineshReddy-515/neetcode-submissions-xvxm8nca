class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,nums,new ArrayList<>(),res);
        return res;
        
        
    }
    public void solve(int ind,int[] nums,List<Integer> list,List<List<Integer>> res){
        res.add(new ArrayList<>(list));
        if(ind>=nums.length) return;
        for(int i=ind;i<nums.length;i++){
            if(i != ind && nums[i]==nums[i-1]) continue; 
            list.add(nums[i]);
            solve(i+1,nums,list,res);
            list.remove(list.size()-1);
        }
    }

}
