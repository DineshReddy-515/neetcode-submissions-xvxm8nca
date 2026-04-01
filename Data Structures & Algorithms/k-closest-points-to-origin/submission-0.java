class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->Integer.compare(b[0]*b[0]+b[1]*b[1],a[0]*a[0]+a[1]*a[1]));
        int res[][]=new int[k][2];
        for(int[] num : points){
            q.add(num);
        }
        while(q.size()>k){
            q.poll();
        }
        int i=0;
        while(!q.isEmpty()){
            res[i++]=q.poll();
        }

        return res;
    }
}
