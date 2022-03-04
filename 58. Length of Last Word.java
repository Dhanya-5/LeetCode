//code stores last string in temp variable until the last string is not null,if null it retains with the //previous string itself and finally returns the length of stored string
class Solution {
    public int lengthOfLastWord(String s) {
        int i,j,n=s.length();int f=0;
        String s1=""; 
        String s2="";
        String temp="";
        for(i=0;i<n;i++)
        {
            for(j=i;j<n&&s.charAt(j)!=' ';j++)
            {
                s1=s1+s.charAt(j);       
            }
            s2=s1;
            if(!s2.equals(""))
                temp=s2;
            s1="";
            i=j;
            
        }
        System.out.println(temp);
        
        return temp.length();
    }
}
