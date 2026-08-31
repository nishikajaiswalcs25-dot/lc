class Solution {
    public int arrangeCoins(int n ) {
        int k=0;
       for(int i=0;i<n;i++){
         if(n>=i+1){
            n=n-(i+1);
            k++;
         }
else{
    break;
}









       }
       return k;
    }
}