class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res=0;
        int val=0;
        int val1=0;
        for(int i=0;i<gas.length;i++){
            val+=gas[i]-cost[i];
            val1 +=gas[i]-cost[i];
            if(cost[i]>gas[i]){
                if(val1 <0) {
                    res=(i+1)%gas.length;
                    val1=0;
                } 
                continue;
            } 

        }
        return val>=0 ? res: -1;
        
    }
}