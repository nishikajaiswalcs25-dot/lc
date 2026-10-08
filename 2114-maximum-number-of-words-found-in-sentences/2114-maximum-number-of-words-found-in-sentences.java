class Solution {
    public int mostWordsFound(String[]s) {
        //int c=0;
        int max=0;
        for(int j=0;j<s.length;j++){
           int c=1;
            String p=s[j]  ;      
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)==' '){
                c++;
            }
        }
            max=Math.max(max,c);
        }
        
return max;
    }
}