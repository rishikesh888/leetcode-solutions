class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int seconds=0;
        
        for(int i=0;i<points.length-1;i++)
        {
            int xdiff=points[i][0]-points[i+1][0];
            int ydiff=points[i][1]-points[i+1][1];
            
            if(xdiff<0)
            {
                xdiff*=-1;
            }
            if(ydiff<0)
            {
                ydiff*=-1;
            }
            if(xdiff>ydiff)
            {
                seconds+=xdiff;
            }
            else
            {
                seconds+=ydiff;
            }
        }
        return seconds;
    }
}