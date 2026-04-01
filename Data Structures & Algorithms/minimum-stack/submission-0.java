class MinStack {
    Stack<Integer> st;
    Stack<Integer> mst;

    public MinStack() {
        st=new Stack<Integer>();
        mst=new Stack<Integer>();
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            mst.push(val);
        }
        else{
            if(mst.peek()>=val){
                mst.push(val);
            }
            st.push(val);
        }
        
    }
    
    public void pop() {
        int n=st.pop();
        if(n==mst.peek()) mst.pop();
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return mst.peek();
    }
}
