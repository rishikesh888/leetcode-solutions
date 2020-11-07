class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        
        int next[][] = new int[m][n];
        
        int dirs[][]=new int[]{
            {-1,0},
            {-1,1},
            {0,1},
            {1,1},
            {1,0},
            {1,-1},
            {0,-1},
            {-1,-1}
        };
        
        for(int i=0;i<m;i++ )
        {
            for(int j=0;j<n;j++)
            {
                int livecount=0;
                for(int dir[]:dirs)
                {
                    int x=dir[0]+i;
                    int y=dir[1]+j;
                    
                    if(x>=0 && x<m && y>=0 && y<n && board[x][y]==1)
                    {
                        livecount++;
                    }
                }
                if(livecount==3 && board[i][j]==0)
                {
                    next[i][j]=1;
                    
                }
                else if(board[i][j]==1)
                {
                    if(livecount==2 || livecount==3)
                    {
                        next[i][j]=1;
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=next[i][j];
            }
        }
    }
}