//here in string array each element is compared with adjacent element for commnon prefix and that common prefix charcters gets stored in an separte array,where that separate array length is checked for every adajacent elements and the string with minimum length is takes into account since its the common character prefix all string elements possess
class Solution {
    public int Check(String s1,String s2)
    {
        int i,j;String s="";int min=100;int t=0,v=0;
        for(i=0,j=0;i<s1.length()&&j<s2.length();i++,j++)
        {
            if(s1.length()==0)
            return 0;
            if(s2.length()==0)
            return 0;
            if((s1.charAt(i)==s2.charAt(j)))
            {
                if(t==0){
                    v=v+t;
                    if(v>=0){
              
                s=s+s1.charAt(i);}
                t=0;
                }
                
            }
            else t=-1;
            
        }
      
        return s.length();
        
    }
    public String longestCommonPrefix(String[] str) 
    {
       
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(""))
            {
                System.out.println("in");
                return "";
                
            }
            
        }
        int i,j,k,min=100;
        String s="";
        if(str.length==0)
            return "";
        else if(str.length==1)
            return str[0];
        else
        {
        for(i=0;i<(str.length-1);i++)
        {
           if(str[i].equals("")){
                return "";}
            int g=Check(str[i],str[i+1]);
            if(min>g)
                min=g;
            System.out.println(m);
        }
       
                        if(min==0)
                            return "";
                        
                        else               
        return str[0].substring(0,m);
        
      
        }
    }
}
