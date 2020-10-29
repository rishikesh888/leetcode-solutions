class Solution {
    public int fib(int N) {
     
        if(N<=1)
        {
            return N;
        }
        return mem(N);
     
    }
    public int mem(int N)
    {
        int fib[] = new int[N+1];
        
        fib[0]=0;
        fib[1]=1;
        
        for(int i=2;i<=N;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[N];
    }
}