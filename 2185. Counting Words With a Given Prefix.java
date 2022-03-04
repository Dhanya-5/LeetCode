//Method 1:using substring()
class Solution {
    public int prefixCount(String[] words, String pref) {
        int i,n=words.length;
        int c=0;
        int m=pref.length();
        for(i=0;i<n;i++)
        {
            String s=words[i];
            if(s.length()>=m)
            {
                if(pref.equals(s.substring(0,m)))
                c++;
            }
        }
        return c;
        
    }
}
//Method 2 : using startsWith()
class Solution {
    public int prefixCount(String[] words, String pref) {
        int i,n=words.length;
        int c=0;
        int m=pref.length();
        for(i=0;i<n;i++)
        {
            String s=words[i];
            if(s.startsWith(pref))
                c++;
        }
        return c;
        
    }
}
