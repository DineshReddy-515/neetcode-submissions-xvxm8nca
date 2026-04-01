class KthLargest {
    PriorityQueue<Integer> q;
    int K;

    public KthLargest(int k, int[] nums) {
        q=new PriorityQueue<>();
        K=k;
        for(int n: nums){
            q.add(n);
            if(q.size()>k) q.poll();
        }
        
    }
    
    public int add(int val) {
        q.add(val);
        
        if(q.size()>K){
            q.poll();
        }
        
        return q.peek();
        
    }
}
