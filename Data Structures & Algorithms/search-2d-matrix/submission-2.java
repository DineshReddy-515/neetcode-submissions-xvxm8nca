class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target) {
                row=i;
                break;
            }
        }
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high){
            int mid=low +(high-low)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
