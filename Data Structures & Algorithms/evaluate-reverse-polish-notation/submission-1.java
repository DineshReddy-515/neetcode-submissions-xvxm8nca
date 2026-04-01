class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int c=b+a;
                st.push(c);
            }else if(s.equals("-")){
                int a=st.pop();
                int b=st.pop();
                int c=b-a;
                st.push(c);
            }else if(s.equals("*")){
                int a=st.pop();
                int b=st.pop();
                int c=b*a;
                st.push(c);
            }else if(s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                int c=b/a;
                st.push(c);
            }else{
                st.push(Integer.parseInt(s));
            }

        }
        return st.pop();
        
    }
}
