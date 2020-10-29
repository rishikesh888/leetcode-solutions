class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int res=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                res++;
            }
            else
            {
                max=Math.max(res,max);
                res=1;
            }
        }
        return Math.max(res,max);
    }
}