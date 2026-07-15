class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        return solve(nums,0);
        
    }
    public boolean solve(int[] nums,int ind){
        if(ind>=nums.length ) return false;
        if(ind==nums.length-1 ) return true;
        if(nums[ind]==0) return false;
        boolean b=false;
        for(int i=1;i<=nums[ind];i++){
            b=b || solve(nums,ind+i);
        }

        return b;
    }
}