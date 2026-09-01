class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        else{
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            String s1 = new String(ss);

            char[] tt = t.toCharArray();
            Arrays.sort(tt);
            String t1 = new String(tt);
            if(s1.equals(t1)){
                return true;
            }

        }
        return false;
    }
}
//aaccerr
//aaccerr
