class Solution {
    public static int reverse(int x) {
        int temp=x;
        int p=0;
    
        while(temp!=0){
            int g=temp%10;
            if(p > Integer.MAX_VALUE/10 || p < Integer.MIN_VALUE/10){
    return 0;
}

        
             p=p*10+g;
             temp=temp/10;
    }
        return p;
    }
     public static void main(String[] args){
 int result=reverse(123);
System.out.println(result);
}

}