class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i,j,k=0;
        int ti[]=new int[2];
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ti[k++]=i;
                    ti[k++]=j;
                }
                
            }
            
            
        }
       // System.out.println("["+ti+","+tj+"]");
        return ti;
        
    }
}
