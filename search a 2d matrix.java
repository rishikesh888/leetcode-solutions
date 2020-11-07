class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
        {
            return false;
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target)
            {
                int result=Arrays.binarySearch(matrix[i],target);
                if(result>0)
                {
                    return true;
                }
            }
        }
        return false;
    }
}