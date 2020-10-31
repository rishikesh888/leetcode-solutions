class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
      List<List<Integer>> master= new ArrayList<>();
      int mindiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
      for(int i=0;i<arr.length-1;i++)
      {
          if(arr[i+1]-arr[i]>mindiff)
          {
              continue;
          }
          
          if(arr[i+1]-arr[i]<mindiff)
          {
              master.clear();
              mindiff=arr[i+1]-arr[i];
          }
          List<Integer> list = new ArrayList<>();
          list.add(arr[i]);
          list.add(arr[i+1]);
          master.add(list);
      }
        return master;
    }
}