class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==0) return 0;
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        for(int n:stones){
            q.add(n);
        }

        while(q.size()>1){
            int x=q.poll();
            int y=q.poll();
            if(x==y) continue;
            q.add(x-y);
        }
        if(q.isEmpty()) return 0;
        return q.poll();
        
    }
}
