class Solution {
    public int numJewelsInStones(String g, String s) {
        int c=0;
       for(int i=0;i<s.length();i++){
        for(int j=0;j<g.length();j++){
        if(s.charAt(i)==g.charAt(j)){
            c++;
        }
        }
       }
       return c; 
    }
}