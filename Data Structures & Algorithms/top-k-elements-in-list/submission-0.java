
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int n: nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        PriorityQueue<int[]> q=new PriorityQueue<>((a,b) -> a[0]-b[0]);

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            q.offer(new int[]{entry.getValue(),entry.getKey()});
            if(q.size()>k){
                q.poll();
            }
            
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.poll()[1];
        }

        return res;
        
        
    }
}
