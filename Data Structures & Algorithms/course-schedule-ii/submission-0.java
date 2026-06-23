class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];

        for(int[] pre : prerequisites){
            indegree[pre[1]]++;
            list.get(pre[0]).add(pre[1]);
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }
        int count=0;
        if(q.size()==0) return new int[0] ;
        int[] res=new int[numCourses];

        while(!q.isEmpty()){
            int curr=q.poll();
            res[numCourses-count-1]=curr;
            count++;
            for(int nei:list.get(curr)){
                indegree[nei]--;
                if(indegree[nei]==0) q.add(nei);
            }
        }

        return count==numCourses ? res : new int[0];
        
    }
}
