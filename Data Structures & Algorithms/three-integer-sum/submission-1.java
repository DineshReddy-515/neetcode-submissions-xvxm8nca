class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> li=new HashSet<>();

        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n-2;i++){
            int low=i+1;
            int high=n-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum<0){
                    low++;
                }else if(sum>0){
                    high--;
                }else{
                    li.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    
                   
                }
               
            }
            if(nums[i]==nums[i+1]) i++;


        }
        return new ArrayList<>(li);
        
    }
}
