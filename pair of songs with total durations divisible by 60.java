 class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res=0;
        for(int i=0;i<time.length;i++)
        {
            time[i]%=60;
        }
        
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        
        for(int i=0;i<time.length;i++)
        {
            int t=time[i];
            
            if(map.containsKey((60-t)%60))
            {
                res+=map.get((60-t)%60);
            }
            
            map.put(t,map.getOrDefault(t,0)+1);
        }
        return res;
    }
}