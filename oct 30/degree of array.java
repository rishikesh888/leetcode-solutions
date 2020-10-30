class Solution {
    public int findShortestSubArray(int[] nums) {
       HashMap<Integer,int[]> map = new HashMap<>();
       int n=nums.length;
       int res=n;
        int degree=1;
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],new int[]{i,i,1});
            }
            else
            {
                int values[] = map.get(nums[i]);
                values[1]=i;
                values[2]++;
                degree=Math.max(degree,values[2]);
            }
        }
        for(int[] values:map.values())
        { 
            if(values[2]==degree){
            res=Math.min(values[1]-values[0],res);
            }
        }
        return res+1;
    }
}