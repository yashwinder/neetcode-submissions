class Solution {
    private boolean validateChar(char c){
        if('A'<=c && c<='Z'){
            return true;
        }
        else if('a'<=c && c<='z'){
            return true;
        }
        else if('0'<=c && c<='9'){
            return true;
        }
        return false;
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
