class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            int m=0;
            int r=i;
            while(r<s.length() && !set.contains(s.charAt(r)) ) {
                set.add(s.charAt(r));
                m++;
                r++;
            }
            max=Math.max(max,m);
        }
        return max;
        
    }
}
