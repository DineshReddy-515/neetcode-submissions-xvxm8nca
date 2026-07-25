/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0) return 0;
        int[] start=new int[intervals.size()];
        int[] end=new int[intervals.size()];
        for(int i=0;i<intervals.size();i++){
            start[i]=intervals.get(i).start;
            end[i]=intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int count=1;
        int p1=1;
        int p2=0;
        while(p1<start.length){
            if(start[p1]>=end[p2]){
                p1++;
                p2++;
                continue;
            }
            count++;
            p1++;
        }
        return count;



    }
}
