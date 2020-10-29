class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            i++;
        }
        
        return sum;
    }
}