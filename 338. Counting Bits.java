//Used inbuilt fun(): bitCount()
class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        int i;
        String s="";int k=0;
        
        for(i=0;i<=n;i++)
        {
          //int a=toBinaryString(i);
            arr[k++]=Integer.bitCount(i);
        }
        return arr;
        
    }
}
