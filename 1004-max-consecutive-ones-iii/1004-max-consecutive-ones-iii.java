class Solution {
    public int longestOnes(int[] arr, int k) {
     int left =0;
     int window=0;
     int ans=0;
     for( int right=0;right<arr.length;right++){
        window=window+arr[right];
         while(window+k<right - left + 1){
            window=window-arr[left];
            left++;

         }
ans = Math.max(ans, right - left + 1);     }
     return ans;
    }
}