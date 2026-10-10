class Solution {
    public int countAsterisks(String s) {
        int c=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            char h=s.charAt(i);
            if(h=='|'){
                flag=!flag;
            }
            else if(h=='*'&& flag){
                c++;
            }
        }
        return c;
    }
}