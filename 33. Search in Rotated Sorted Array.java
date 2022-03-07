//This code runs in O(logn) time
class Solution {
    public int search(int[] arr, int target) {
        int i,j=0;
        int ind=0;  
            for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                ind=i+1;
        }
         if(ind>0)
        {
        if(target>=arr[0])
        {
            for(i=0;i<ind;i++)
            {
                if(arr[i]==target)
                    return i;    
            }
        }
        else
        {
            for(i=ind;i<arr.length;i++)
            {
                 if(arr[i]==target)
                    return i;
                
            }
            
        } 
        }
        else
        {
            for(i=0;i<arr.length;i++)
            {
                if((arr[i]>target)&&(j==0))
                    return -1;
                else if(arr[i]==target)
                {
                    j++;
                    return i;
                    
                }
            }
            
        }
        
        return -1;
        
    }
}
