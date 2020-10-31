class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        int firstpartition=0;
        int secondpartition=0;
        
        for(int i:A)
        {
            sum+=i;
        }
        if(sum%3!=0)
        {
            return false;
        }
         int  target=sum/3;
         int j=0;
        for(;j<A.length;j++)
        {
            firstpartition+=A[j];
            
            if(firstpartition==target)
            {
             break;   
            }
        }
        int k=j+1;
        
        for( ; k<A.length;k++)
        {
            secondpartition+=A[k];
            if(secondpartition==target)
            {
                break;
            }
        }
        return secondpartition==target && k!=A.length-1;
    }
}