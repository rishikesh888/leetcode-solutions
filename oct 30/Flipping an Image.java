class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++)
        {
            int start=0;
            int end=A[i].length-1;
            while(start<=end)
            {
                A[i][start]=A[i][start]==0? 1:0;
                if(start!=end)
                {
                    A[i][end] =A[i][end]==0? 1:0;
                    int temp=A[i][start];
                    A[i][start]=A[i][end];
                    A[i][end]=temp;
                }
                start++;
                end--;
            }
        }
        return A;
    }
}