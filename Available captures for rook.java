class Solution {
    public int numRookCaptures(char[][] board) {
       int count=0;
       int x=0;
       int y=0;
       int l=board.length;
       int c=board[0].length;
        
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(board[i][j]=='R')
                {
                    x=i;
                    y=j;
                }
            }
        }
        for(int i=x+1;i<l;i++)
        {
            char s=board[i][y];
            if(s=='B')
            {
                break;
            }   
            else if(s=='p')
            {
                count++;
                break;
            }
        }
        for(int j=y+1;y<c;j++)
        {
            char s=board[x][j];
            if(s=='B')
            {
                break;
            }
            else if(s=='p')
            {
                count++;
                break;
            }
        }
         for(int i=x-1;i>=0;i--)
        {
            char s=board[i][y];
            if(s=='B')
            {
                break;
            }
            else if(s=='p')
            {
                count++;
                break;
            }
        }
        
         for(int j=y-1;j>=0;j--)
        {
            char s=board[x][j];
            if(s=='B')
            {
                break;
            }
            else if(s=='p')
            {
                count++;
                break;
            }
        }
        
        return count;
    }
}