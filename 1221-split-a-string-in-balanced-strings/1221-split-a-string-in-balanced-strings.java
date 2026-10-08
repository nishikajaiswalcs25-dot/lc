class Solution {
    public int balancedStringSplit(String s) {
       int  c=0;
       int p=0;
       for(int i=0;i<s.length();i++){
       if(s.charAt(i) == 'R') c++;
       else c--;
       if(c==0)p++;}
       return p;
    }
}