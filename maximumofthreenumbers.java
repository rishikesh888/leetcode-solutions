class Solution {
    public int maximumProduct(int[] nums) {
         int len=nums.length;
        Arrays.sort(nums);
        int res;
        res=Math.max(nums[0]*nums[1]*nums[len-1],nums[len-1]*nums[len-2]*nums[len-3]);
        return res;
    }
}