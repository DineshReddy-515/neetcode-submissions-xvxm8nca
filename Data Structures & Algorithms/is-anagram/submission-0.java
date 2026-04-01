class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sch=s.toCharArray();
        char[] tch=t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);
        boolean b=Arrays.equals(sch,tch);

        return b;

    }
}
