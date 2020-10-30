class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<deck.length;i++)
        {
            if(!map.containsKey(deck[i]))
            {
                map.put(deck[i],1);
            }
            else
            {
                map.put(deck[i],map.get(deck[i])+1);
            }
        }
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> val = new ArrayList<>();
        for(int k=0;k<deck.length;k++)
        {
            val.add(map.get(deck[k]));
        }
        for(int j=0;j<val.size();j++)
        {
            set.add(val.get(j));
        }
        return set.size()==1;
    }
}