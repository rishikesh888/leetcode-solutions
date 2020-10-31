class Solution {
    public int countCharacters(String[] words, String chars) {
       int charArr[]= new int[26];
        
        for(int i=0;i<chars.length();i++)
        {
            charArr[chars.charAt(i)-'a']++;
        }
        int count=0;
        for(String word:words)
        {
            if(word.length()<=chars.length() && isFit(word.toCharArray(),charArr))
            {
                count+=word.length();
            }
        }
        
        return count;
    }
    
    boolean isFit(char[] wordArr, int[] charArr)
    {
        int arr[] = new int[26];
        
        for(int i=0;i<wordArr.length;i++)
        {
            arr[wordArr[i]-'a']++;
            
            if(charArr[wordArr[i]-'a']<arr[wordArr[i]-'a'])
            {
                return false;
            }
        }
        return true;
    }
        
}