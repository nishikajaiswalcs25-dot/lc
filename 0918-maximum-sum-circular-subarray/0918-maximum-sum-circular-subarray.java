class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int sum = 0, max = arr[0], min = arr[0];
        int curMax = 0, curMin = 0;

        for(int x : arr) {
            sum += x;

            curMax = Math.max(x, curMax + x);
            max = Math.max(max, curMax);

            curMin = Math.min(x, curMin + x);
            min = Math.min(min, curMin);
        }

        if(max < 0) return max;

        return Math.max(max, sum - min);

    }
}
