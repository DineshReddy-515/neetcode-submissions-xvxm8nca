class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int p=1, c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) c++;
            else p*=nums[i];
        }
        if(c>=2) return res;
        if(c==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i] == 0){
                    res[i]=p;
                }
            }
            return res;
        }
        for(int i=0;i<nums.length;i++){
            res[i]=p/nums[i];
        }
        return res;
        
    }
}  
