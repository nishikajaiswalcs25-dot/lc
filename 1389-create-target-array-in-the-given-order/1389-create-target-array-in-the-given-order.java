import java.util.*;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List <Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(index[i],nums[i]);
        }
        int[] r=new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            r[i] = ans.get(i);
        }
      return r; 
    }
}