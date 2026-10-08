class Solution {
    public String interpret(String c) {
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(i.equals("G"))
        c=c.replace("()","o");
        c=c.replace("(al)","al");

        
        return c;
    }
}