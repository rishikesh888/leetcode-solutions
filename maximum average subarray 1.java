class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double res=sum;
        for(int j=k;j<nums.length;j++)
        {
            sum+=nums[j]-nums[j-k];
            res=Math.max(res,sum);
        }
        return res/k;
    }
}