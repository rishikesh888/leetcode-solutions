class Solution {
    public int removeDuplicates(int[] nums) {
        int id=0;
        int count=0;
        int target=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=target)
            {
                target=nums[i];
                count=0;
            }
            if(nums[i]==target && count<2)
            {
                nums[id++]=nums[i];
                count++;
            }
        }
        return id;
    }
}