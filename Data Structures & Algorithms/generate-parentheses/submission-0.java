class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        solve("",0,0,n,li);
        return li;
    }
    public void solve(String s,int o,int c,int n,List<String> li){
        if(o==c && c==n) {
            li.add(s);
            return;
        }
        if(c>n || o>n) return;
        if(c>o) return;
        solve(s+ "(",o+1,c,n,li);
        solve(s+ ")",o,c+1,n,li);
    }
}
