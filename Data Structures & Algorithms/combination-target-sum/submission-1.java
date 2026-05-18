class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> l=new ArrayList<>();
        if(target==0) return l;

        solve(nums,0,0,target, new ArrayList<>(),l);
        return l;
        
    }
    public void solve(int[] nums,int ind,int total,int target,List<Integer> li,List<List<Integer>> l){
        if(target==total){
            l.add(new ArrayList<>(li));
            return;
        }
        if(ind==nums.length || total > target) return;

        li.add(nums[ind]);
        solve(nums,ind,total+nums[ind],target,li,l);

        li.remove(li.size()-1);    
        solve(nums,ind+1,total,target,li,l);

    }
}
