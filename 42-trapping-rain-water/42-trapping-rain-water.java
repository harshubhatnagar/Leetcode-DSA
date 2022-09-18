class Solution {
    public int trap(int[] height) {
         
        int n = height.length;
        
        int start =0;
        int end = n-1;
        
        int startMax = 0;
        int endMax = 0;
        
        int res =0;
        
        while(start <= end)
        {
            if(height[start] <= height[end])
            {
                if(height[start] >= startMax)
                    startMax = height[start];
                else
                    res += startMax - height[start];
                    
                start++;
            }
            else
            {
                if(height[end] >= endMax)
                    endMax = height[end];
                else
                    res += endMax - height[end];
                
                
                end--;
                
            }
        }
        
        return res;
    }
}