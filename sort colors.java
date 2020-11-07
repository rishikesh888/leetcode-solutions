class Solution {
    public void sortColors(int[] nums) {
        int a[] = new int[3];
        if(nums.length<=1)
        {
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            switch(nums[i])
            {
                case 0:a[0]++;
                case 1:a[1]++;
                case 2:a[2]++;
            }
        }
        int i=0;
        while(a[0]-->0)
        {
            nums[i]=0;
            i++;
        }
        while(a[1]-->0)
        {
           nums[i]=1;
            i++;
        }
        while(a[2]-->0)
        {
            nums[i]=2;
            i++;
        }
    }
}