class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree=new int[numCourses];
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        Arrays.fill(indegree,0);
        for(int[] pre : prerequisites){
            indegree[pre[1]] +=1 ;
            list.get(pre[0]).add(pre[1]);
        }
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }

        while(!q.isEmpty()){
            int curr=q.poll();
            count++;
            for(int nei : list.get(curr)){
                indegree[nei]--;
                if(indegree[nei]==0) q.add(nei);
            }

        }

        return count==numCourses ? true : false ;
        
    }
}
