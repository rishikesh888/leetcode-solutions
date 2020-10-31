import java.util.Arrays;

class Solution {
    int count=0;
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for(int i=0;i<heights.length;i++) {
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        
        for(int i=0; i<heights.length;i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}