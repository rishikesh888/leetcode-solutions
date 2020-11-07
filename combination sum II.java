class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> res = new ArrayList<>();
      Arrays.sort(candidates);
      findcombinations(candidates,0,target,new ArrayList<Integer>(),res);
      return res;
    }
    public void findcombinations(int[] cand,int index,int target,List<Integer> current,List<List<Integer>>res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(current));
            return;
        }
        if(target<0)
        {
            return;
        }
        
        for(int i=index;i<cand.length;i++)
        {
            if(i==index || cand[i]!=cand[i-1])
            {
              current.add(cand[i]);
              findcombinations(cand,i+1,target-cand[i],current,res);
              current.remove(current.size()-1);
            }
        }
    }
}