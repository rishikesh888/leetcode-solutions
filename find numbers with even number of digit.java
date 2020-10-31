class Solution {
    public int findNumbers(int[] nums) {
      if(nums.length==0)
      {
          return 0;
      }
      int count=0;
        
      for(int num:nums)
      {
          if((num>9 && num<100)||(num>999 && num<10000)||(num==100000))
          {
              count+=1;
          }
      }
        return count;
    }
}