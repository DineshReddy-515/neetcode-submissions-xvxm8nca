class Solution {
    int max=Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                max=Math.max(sum,max);
            }
        }
        return max;
        
    }
    
}
