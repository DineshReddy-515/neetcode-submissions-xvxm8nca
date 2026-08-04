class Solution {
    private List<List<String>> res=new ArrayList();
    private List<String> list=new ArrayList();

    public List<List<String>> partition(String s) {
        solve(s,0,0);
        return res;    
    }

    private void solve(String s,int i,int j){
        if(j>=s.length()){
            if(i==j){
                res.add(new ArrayList<>(list));
            }
            return ;
        }

        if(palin(s,i,j)){
            list.add(s.substring(i,j+1)) ;
            solve(s,j+1,j+1) ;
            list.remove(list.size() -1);
        }
        solve(s,i,j+1);

    }

    private boolean palin(String s, int i,int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
