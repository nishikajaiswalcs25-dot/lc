class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int []ans=new int [arr1.length+arr2.length];
        int i=0,j=0,k=0;
    //  for(int i=0;i<arr1.length;i++){
    //     ans=arr1[i];
    //  }
    //  for(int i=0;i<arr2.length;i++){
    //     ans[arr1.length+i]=arr2[i];
    //  }
     while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            ans[k++]=arr1[i++];
        }
        else{
            ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length)ans[k++]=arr1[i++];
        while(j<arr2.length)ans[k++]=arr2[j++];
    //  System.out.println(Arrays.toString(ans));
// return 0.0;
int n=arr1.length+arr2.length;
if(n%2==1){
    return ans[n/2];
}
else{
    int b1=ans[n/2];
    int b2=ans[n/2-1];
    return (b1 + b2) / 2.0;
}
     }

    }
