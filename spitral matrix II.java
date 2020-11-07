class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        
        int rowbegin=0;
        int rowend=n-1;
        int colbegin=0;
        int colend=n-1;
        
        int count=1;
        while(rowbegin<=rowend && colbegin<=colend)
        {
            for(int i=colbegin;i<=colend;i++)
            {
                res[rowbegin][i]=count;
                count++;
            }
            rowbegin++;
            
            for(int i=rowbegin;i<=rowend;i++)
            {
                res[i][colend]=count;
                count++;
            }
            colend--;
            if(rowbegin<=rowend)
            {
                for(int i=colend;i>=colbegin;i--)
                {
                    res[rowend][i]=count;
                    count++;
                }
            }
            rowend--;
            
            if(colbegin<=colend)
            {
                for(int i=rowend;i>=rowbegin;i--)
                {
                    res[i][colbegin]=count;
                    count++;
                }
            }
            colbegin++;
            
        }
        return res;
    }
}