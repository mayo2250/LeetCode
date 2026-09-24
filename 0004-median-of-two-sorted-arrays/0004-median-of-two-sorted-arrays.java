class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int t=m+n;
        int c1 = t%2;
        int i=0,j=0;
        int a=0,b=0;
        for(int c=0;c<=(t/2);c++){
            if(i<m && (j>=n || nums1[i]<=nums2[j])){
                a=b;
                b=nums1[i];
                i++;
            }else{
                a=b;
                b=nums2[j];
                j++;
            }
        } 
        if(c1==1) return b;
        else return ((a+b)/2.0);
    }
}