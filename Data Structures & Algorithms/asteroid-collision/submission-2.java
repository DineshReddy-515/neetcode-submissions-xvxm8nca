class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        
        for(int num : asteroids){
            int a=num;
            while(!st.isEmpty() && a<0 && st.peek()>0){
                if(Math.abs(a) == Math.abs(st.peek())) {
                    a=0;
                    st.pop();
                    break;
                }
                else if(Math.abs(a) > Math.abs(st.peek())){
                    st.pop();
                    
                }else a=0;
            }

            if(a!=0) st.push(a);
            

        }
        int []n=new int[st.size()];
        int size=st.size();
        for(int i=0;i<size;i++){
            n[size-i-1]=st.pop();
        }
        return n;

        
    }
    
}