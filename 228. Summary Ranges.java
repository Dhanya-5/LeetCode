class Solution {
    public List<String> summaryRanges(int[] arr) {
        List<String>ls=new ArrayList<String>();
        int i,s=0,e=0,j,max=0,c=0;
        int n=arr.length;
        
        j=0;
        for(i=0;i<n;i++)
        {
            j=i;
            s=j;
            while((j<n-1)&&(arr[j]+1==arr[j+1]))
            {
                c++;
                e=j+1;
                j++;
            }
           i=j;
            
            if(e==0)
                ls.add(""+arr[s]);
            else
                ls.add(arr[s]+"->"+arr[e]);
            e=0;
        }
        for(i=0;i<ls.size();i++)
        {
            System.out.println(ls.get(i));
        }
        return ls;
        
    }
}
