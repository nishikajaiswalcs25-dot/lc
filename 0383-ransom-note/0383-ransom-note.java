class Solution {
    public boolean canConstruct(String s, String t) {
        int n = s.length();
        int m =  t.length();
        char arr[] = s.toCharArray();
        char brr[] = s.toCharArray();
        int fre1[] = new int[256];
        int fre2[] = new int[256];
        for(int i = 0; i<n; i++){
            char ch =  s.charAt(i);
            fre1[ch - 'a']++;
        }
        for(int i = 0; i<m; i++){
            char ch =  t.charAt(i);
            fre2[ch - 'a']++;
        }
        for(int i = 0; i<256; i++){
            if(fre1[i] > fre2[i]){
                return false;
            }
        }
        return true;
    }
}