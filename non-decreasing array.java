class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean change=false;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<=nums[i])
            {
                continue;
            }
            
            else if(!change)
            {
                change=true;
                
                if(i==1 || nums[i-2]<=nums[i] )
                {
                    nums[i-1]=nums[i];
                }
                else
                {
                    nums[i]=nums[i-1];
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}