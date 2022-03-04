class Solution {
    public int reverse(int x) {
        if(x==0)
            return x;
         String s=x+"";
        
        StringBuffer buf=new StringBuffer(s);
       
        try{
            buf.reverse();
       s=buf.toString();
        if((s.charAt(0)=='0')&&(s.charAt(s.length()-1)!='-'))
        { int n=Integer.parseInt(s.substring(1,s.length()));
        return n;}
        else if((s.charAt(0)!='0')&&(s.charAt(s.length()-1)=='-'))
        { int n=Integer.parseInt(s.substring(0,s.length()-1));
        return -n;}
        else if((s.charAt(0)=='0')&&(s.charAt(s.length()-1)=='-'))
        { int n=Integer.parseInt(s.substring(1,s.length()-1));
        return -n;}
        
       
        return Integer.parseInt(s);
            
        }
        catch(Exception e)
        { 
            return 0;
        }   
    }
}
