class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int res[][] = new int[r][c];
        
        if(nums.length==0 || r*c!=nums.length*nums[0].length)
        {
            return nums;
        }
        
        Queue<Integer> qu = new LinkedList();
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                qu.add(nums[i][j]);
            }
        }
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[i][j]=qu.remove();
            }
        }
        return res;
    }
}