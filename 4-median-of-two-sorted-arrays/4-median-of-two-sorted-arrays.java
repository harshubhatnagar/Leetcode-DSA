class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m = nums1.length;
    int n = nums2.length;
    return median(nums1,nums2,m,n);
    }
    public double median(int [] nums1,int[] nums2,int m ,int n)
    {
        if(m > n)
            return median(nums2,nums1,n,m);
        
        int low =0;
        int high = m;
        int medPos = ((m+n)+1)/2;
        
        while(low <= high)
        {
            int cut1 = (low+high) >> 1;
            int cut2 = medPos - cut1;
            
            int left1 = (cut1 == 0)  ?  Integer.MIN_VALUE: nums1[cut1-1];
            int left2 = (cut2 == 0)  ?  Integer.MIN_VALUE: nums2[cut2-1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE: nums1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE: nums2[cut2];
            
            if(left1 <= right2 && left2 <= right1)
            {
                if((m+n)%2 != 0)
                    return Math.max(left1,left2);
                else
                    return (Math.max(left1,left2) + Math.min(right1,right2))/2.0;
            }
            
            else if(left1 > right2)
                high = cut1 - 1;
            else
                low = cut1 +1;
        }
        return 0.0;
    }
}