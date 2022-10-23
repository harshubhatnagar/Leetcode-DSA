class Solution {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        
        while(i < nums.length)
        {
            int correct =nums[i] -1;
            
            if(nums[i] != nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
                i++;
        }
        
        int[] ans = new int[2];
        
        for(int idx = 0;idx < nums.length;idx++)
        {
            if(nums[idx]!= idx + 1){
                ans[0] = nums[idx];
                ans[1] = idx +1;
            }
        }
        return ans;
    }
}