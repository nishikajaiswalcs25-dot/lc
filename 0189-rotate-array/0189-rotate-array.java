class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        k = k % n;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        l = 0;
        r = k - 1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    l = k;
    r =  n - 1;
     while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    }
