class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        int max=1;
        for(int num: nums){
            set.add(num);
        }
        for(int num: nums){
            if(set.contains(num-1)) continue;
            int c=1;
            while(set.contains(++num)) c++;
               
            max=Math.max(max,c);
        }
        return max;
    }
}
