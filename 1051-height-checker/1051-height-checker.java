class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
     int[]nishi=heights.clone();; 
   Arrays.sort(nishi);
   for(int i=0;i<heights.length;i++){
         if(heights[i]!=nishi[i])count++;
   }
   return count;
    }
}