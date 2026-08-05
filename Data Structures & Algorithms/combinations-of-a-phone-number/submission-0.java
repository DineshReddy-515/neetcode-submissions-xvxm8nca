class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0) return res;

        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,map,res,new StringBuilder(""),0);
        return res;
        
    }

    private void solve(String digits,String[] map,List<String> res, StringBuilder sb,int i){
        if(i==digits.length()){
            res.add(sb.toString());
            return;
        }

        String letters=map[digits.charAt(i)-'0'];

        for(char ch : letters.toCharArray()){
            sb.append(ch);
            solve(digits,map,res,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
