class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        
        solve(nums,new ArrayList<>(),li,0);
        return li;
    }
    public void solve(int[] nums,List<Integer> list,List<List<Integer>> li,int ind){
        if(ind==nums.length)
            li.add(new ArrayList<>(list));
        if(ind>=nums.length) return;

        
        list.add(nums[ind]);
        solve(nums,list,li,ind+1);

        list.remove(list.size()-1);
        solve(nums,list,li,ind+1);

    }
}
