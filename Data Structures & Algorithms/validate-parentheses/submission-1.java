class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']' || s.charAt(i)=='}'|| s.charAt(i)==')'){
                if(st.isEmpty()) return false;
                char ch=st.pop();
                if(s.charAt(i)==']' && ch=='[') continue;
                else if(s.charAt(i)=='}' && ch=='{') continue;
                else if(s.charAt(i)==')' && ch=='(') continue;
                else return false;


            }else{
                st.push(s.charAt(i));
            }
        }

        return st.isEmpty();
        
    }
}
