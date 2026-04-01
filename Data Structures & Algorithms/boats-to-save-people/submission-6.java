class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int m=Arrays.stream(people).max().getAsInt();
        int[] arr=new int[m+1];
        for(int p: people){
            arr[p]++;
        }

        int right=m;
        int left=0;
        int res=0;
        while(left<right){
            while(left<right && arr[left]==0) left++;
            while(left<right && arr[right]==0) right--;
            if(left>=right) break;
            if(left + right <= limit){
                int min=Math.min(arr[left],arr[right]);
                res += min;
                arr[left] -=min ;
                arr[right]-=min;

                if(arr[left]==0) left++;
                if(arr[right]==0) right--;
               
            }else{
                res+=arr[right];
                arr[right]=0 ;
            }
        }

        if(left==right){
            if( 2* left<=limit){
                res += (arr[left]+1)/2;
                
            }else{
                res +=arr[left];
                
            }
        }

        

        return res;
        
    }
}