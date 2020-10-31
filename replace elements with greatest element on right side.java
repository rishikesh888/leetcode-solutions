class Solution {
    public int[] replaceElements(int[] arr) {
      int length=arr.length;
        
        if(length==1)
        {
            arr[0]=-1;
            return arr;
        }
        int res[]=new int[length];
        res[length-1]=-1;
        int max=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            int a=arr[i];
            res[i]=max;
            max=Math.max(max,arr[i]);
        }
        
        return res;
    }
}