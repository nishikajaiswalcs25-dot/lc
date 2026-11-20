class Solution {
    public int minLength(String s) {
        while(true){
        String p=s;
        s=s.replace("AB","");
        s=s.replace("CD","");
        if(s.equals(p)){
            break;
        }

        }
        return s.length();
    }
}