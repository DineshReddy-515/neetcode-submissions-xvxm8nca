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
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int rooms=0;
        for(Interval interval:intervals){
            int st=interval.start;
            while(!pq.isEmpty() && pq.peek() <= st) pq.poll();
            pq.offer(interval.end);
            rooms=Math.max(rooms,pq.size());
        }
        return rooms;
    }
}
