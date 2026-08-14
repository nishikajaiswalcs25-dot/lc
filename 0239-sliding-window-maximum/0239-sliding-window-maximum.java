class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        if(arr==null||arr.length==0)return new int[0];
        int n =arr.length;
        int[] res=new int[n-k+1];
        int [] deque=new int[n];
        int head=0;
        int tail=0;
        for(int i=0;i<n;i++){
        if(head<tail && deque[head]<i-k+1){
            head++;
        }
            while(head<tail && arr[deque[tail-1]]<arr[i]) {
            tail--;
            }
        deque[tail++]=i;
        if(i>=k-1){
            res[i-k+1]=arr[deque[head]];

        }
    }
     return res;
}
}





