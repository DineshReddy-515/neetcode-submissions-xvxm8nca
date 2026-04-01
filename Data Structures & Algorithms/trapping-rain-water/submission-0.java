class Solution {
    public int trap(int[] height) {
        // int left=0;
        // int right=height.length-1;
        int maxLeft=0;
        int maxRight=0;
        Stack<Integer> st=new Stack<Integer>();
        st.push(height[height.length-1]) ;
        for(int i=1;i<height.length;i++){
            if(st.peek()<=height[height.length-i-1]) st.push(height[height.length-1-i]);
        }
        int water=0;
        for(int i=0;i<height.length;i++){
            maxRight=st.peek();
            if(st.peek()==height[i]) st.pop();
            maxLeft=Math.max(maxLeft,height[i]);
            water+=Math.min(maxLeft,maxRight)-height[i];
        }

        return water;
        
        
    }
}
