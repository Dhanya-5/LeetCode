//Merge two sorted arrays and again sort the combined array and find the median of that array.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=0;double m,h;
        int i,k=0;
        int arr[]=new int[nums1.length+nums2.length];
        for(i=0;i<nums1.length;i++)
        {
            arr[k++]=nums1[i];
        }
        for(i=0;i<nums2.length;i++)
        {
            arr[k++]=nums2[i];
        }
        Arrays.sort(arr);
   
        if(k%2!=0)
        {
            h=arr[(k/2)];
            
        }
        else
        {
            double d=arr[k/2]+arr[(k/2)-1];
            h=(double)d/2;
        }
        return h;
    }
          
}
