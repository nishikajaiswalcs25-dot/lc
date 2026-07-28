class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      
    int c=0;
    int count=0;
    int avg=0;
    for(int i=0;i<k;i++ ){
        c+=arr[i];
         
    }
  avg=c/k;
if(avg>=threshold){
        count++;}
for(int i=1;i<=arr.length-k;i++){
    c=c-arr[i-1]+arr[i+k-1];
    avg=c/k;
if(avg>=threshold){
        count++;
    }
}
  return count; 
    }
}