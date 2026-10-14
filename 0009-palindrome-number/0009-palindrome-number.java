class Solution {
    public static boolean isPalindrome(int x) {
        int temp= x;
        int p=0;
        while(temp>0){
            int g=temp%10;
            p=p*10+g;
            temp=temp/10;
        }


    
    return p==x;
    }
    public static void main(String[] args){
boolean result=isPalindrome(121);
System.out.println(result);
}
}