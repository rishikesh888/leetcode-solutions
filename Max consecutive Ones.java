class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        
        for(Integer num:nums)
        {
            if(num==1)
            {
                count++;
            }
            else
            {
                maxcount=Math.max(maxcount,count);
                count=0;
            }
        }
        maxcount=Math.max(maxcount,count);
        return maxcount;
    }
}