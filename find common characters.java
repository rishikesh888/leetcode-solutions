   class Solution {
    public List<String> commonChars(String[] A) {
      List<String> res = new ArrayList<>();
      int mat[][] = new int[A.length][26];
        
      for(int i=0;i<A.length;i++)
      {
          for(Character c:A[i].toCharArray())
          {
              mat[i][c-'a']++;
          }
      }
      
      for(int i=0;i<26;i++)
      {
          for(int j=1;j<A.length;j++)
          {
              mat[0][i]=Math.min(mat[0][i],mat[j][i]);
          }
          
          for(int k=0;k<mat[0][i];k++)
          {
              res.add(Character.toString((char)('a'+i)));
          }
      }
        return res;
    }
}