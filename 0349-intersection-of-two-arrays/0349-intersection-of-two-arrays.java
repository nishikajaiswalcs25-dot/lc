class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int []r=new int[nums1.length];
        int k=0;
        for(int i=0; i<nums1.length; i++){
    boolean duplicate = false;
    for(int x=0; x<k; x++){
        if(r[x] == nums1[i]){
            duplicate = true;
            break;
        }
    }
    if(duplicate)
        continue;
    for(int j=0; j<nums2.length; j++){
        if(nums1[i] == nums2[j]){
            r[k++] = nums1[i];
            break;
        }
    }
}
return Arrays.copyOf(r, k);
    }
}