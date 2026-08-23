class Solution {
     public int minEatingSpeed(int[] arr, int  hr) {
int l = 1;
int h = 0;
// int long=0;
for(int x : arr){
    h = Math.max(h, x);
}

while(l <= h){

    int mid = l + (h-l)/2;
    long hours = 0;

    for(int x : arr){
        hours += (x + mid - 1) / mid;
    }

    if(hours <= hr){
        h = mid - 1;
    }
    else{
        l = mid + 1;
    }
}

return l;
     }
}
