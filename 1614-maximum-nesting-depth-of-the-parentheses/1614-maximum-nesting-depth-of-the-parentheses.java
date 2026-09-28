class Solution {
    public int maxDepth(String s) {
     int max=0;
     int md=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            max++;
            md=Math.max(max,md);
        }
        else if(s.charAt(i)==')'){
            max--;
        }
     }
     return md;
    }
}