class Solution {
    private boolean validateChar(char c){
        return Character.isLetterOrDigit(c);
    }
    public boolean isPalindrome(String s) {
        if(s==null || s.isBlank()){
            return true;
        }
        int len = s.length();
        int left = 0, right = len-1;
        while(left < right){
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if(!validateChar(leftChar)){
                left++;
                continue;
            }
            if(!validateChar(rightChar)){
                right--;
                continue;
            }
            if(leftChar!=rightChar){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
