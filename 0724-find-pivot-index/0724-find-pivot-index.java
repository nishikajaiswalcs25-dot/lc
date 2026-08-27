class Solution {
    public int pivotIndex(int[] arr ){
        int l=0;
        int h=arr.length-1;
      //  int mid=l+(h-l)/2;
      for(int i=0;i<arr.length;i++ ){
        int lsum=0;
        int rsum=0;
        
        for(int j=0;j<i;j++){
          lsum=lsum+arr[j];
        }
        for(int j=i+1;j<arr.length;j++){
            rsum=rsum+arr[j];
        }
        if(lsum==rsum){
            return i;
        }
        }
        
        return -1;
    }
}