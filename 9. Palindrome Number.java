class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuffer buf=new StringBuffer();
        buf.append(s);
        buf.reverse();
        String s1=buf.toString();
        if(s.equals(s1))
            return true;
        else 
            return false;
    }
}
