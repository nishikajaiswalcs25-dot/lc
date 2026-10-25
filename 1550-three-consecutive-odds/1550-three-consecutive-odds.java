class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        int k=3;
        for(int i=0;i<arr.length;i++){
              if(arr[i]%2!=0){
               c++;
              }
              else{
                c=0;
              }
            if(c==k){
                return true;
            }
        }
        return false;
    }
}