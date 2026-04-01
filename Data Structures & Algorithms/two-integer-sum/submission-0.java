class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i=0;i<hs.size();i++){
            int c=target-nums[i];
            if(hs.containsKey(c) && hs.get(c)!=i){
                return new int[]{i,hs.get(c)};
            }

        }
        return new int[0];
    }
}
