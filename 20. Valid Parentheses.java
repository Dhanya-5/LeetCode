//Used stack concept
class Solution {
    public char stack[]=new char[7000];
    public int top=-1;
    public void Push(char c)
    {
        if(top==6999)
        {
            System.out.println("FULL");
        }
        else
        {
            stack[++top]=c;
        }
    }
    public char Pop()
    {
        char c='a';
        if(top==-1)
        {
            System.out.println("Empty");
        }
        else
        {
            c=stack[top--];
        }
        return c;
    }
    public boolean isValid(String s) {
        int c=0;
        if((s.length()==1)||(s.length()==0))
            return false;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='[')||(s.charAt(i)=='(')||(s.charAt(i)=='{'))
            Push(s.charAt(i));
            else
            {
             char ch=Pop();
             if(s.charAt(i)==')')
             {
                 if(ch!='(')
                     c++;
             }
            else if(s.charAt(i)==']')
             {
                 if(ch!='[')
                     c++;
             }
            else if(s.charAt(i)=='}')
             {
                 if(ch!='{')
                     c++;
             }
                 
            }
        }
        if((c==0)&&(top==-1))
            return true;
        else 
            return false;
        
        
    }
}
