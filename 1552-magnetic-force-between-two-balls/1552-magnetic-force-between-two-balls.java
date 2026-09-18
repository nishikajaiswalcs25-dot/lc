class Solution {
    public int maxDistance(int[]arr, int k) {
       Arrays.sort(arr);
      int l=1;
      int ans=-1;
      int r=arr[arr.length-1]-arr[0];
      while(l<=r){
          int mid=l+(r-l)/2;
         int c=cp(arr,mid);
         if(c>=k){
             ans=mid;
             l=mid+1;
         }
         else{
             r=mid-1;
         }
      }
     
         return ans; 
    }
    int cp(int arr[],int d){
        int c=1;
        int p=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-p >= d){
                c++;
                p=arr[i];
                
            }
        }
        return c;  
    }
}