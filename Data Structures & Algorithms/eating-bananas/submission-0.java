class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r=piles[0];
        for(int i=0;i<piles.length;i++){
            r=Math.max(r,piles[i]);
        }
        int l=1;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            int hours=0;
            for(int i=0;i<piles.length;i++){
                hours += Math.ceil((double)piles[i]/mid);
            }
            if(hours<=h){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }

        }

        return ans;
        
    }
}
