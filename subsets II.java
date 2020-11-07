class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
     List<List<Integer>> res = new ArrayList<>();
         dfs(res, new ArrayList<>(), nums, 0);
        return res;
    }
    public void dfs( List<List<Integer>> res, List<Integer> temp, 
                int[] nums, int p){
        res.add(new ArrayList<>(temp));

        for(int i = p; i < nums.length; i++){
            if(i>p && nums[i]==nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            dfs(res, temp, nums, i + 1);
            temp.remove(temp.size() -1);
        }      
    }
}