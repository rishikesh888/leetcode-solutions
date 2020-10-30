class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0;
        int sumB=0;
      for(int i:A)
      {
         sumA+=i; 
      }
      for(int j:B)
      {
          sumB+=j;
      }
      int diff=(sumB-sumA)/2;
      HashSet<Integer> setb= new HashSet<>();
        for(int k:B)
        {
            setb.add(k);
        }
        
        for(int x:A)
        {
            int val=x+diff;
            if(setb.contains(val))
            {
                return new int[]{x,val};
            }
        }
        throw null;
    }
}