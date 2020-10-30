class Solution {
    public int dominantIndex(int[] nums) {
        int len=nums.length;
        int maxindex=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]>nums[maxindex])
            {
                maxindex=i;
            }
        }
        for(int i=0;i<len;i++)
        {
            if(maxindex!=i&& nums[maxindex]<2*nums[i])
            {
                return -1;
            }
        }
        return maxindex;
    }
}