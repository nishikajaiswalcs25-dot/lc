class Solution {
    public boolean judgeCircle(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U')a++;
            else if(s.charAt(i)=='D')a--;
            else if(s.charAt(i)=='R')b++;
           else b--;
        }
        return a==0 && b==0;
    }
}