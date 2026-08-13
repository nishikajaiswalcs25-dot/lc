class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int left =0;
        int right =n-1;
         while (left<right){
            char ch=s.charAt(left);
        char sh=s.charAt(right);
            if(!Character.isLetterOrDigit(ch)){
        left++;
    }
    else if(!Character.isLetterOrDigit(sh)){
        right--;
    }
    else if(Character.toLowerCase(ch) != Character.toLowerCase(sh)){
        return false;
    }
    else{
        left++;
        right--;
    }
}
    
    return true ;
    }
}
