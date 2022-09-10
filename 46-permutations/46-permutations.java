class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        backtrack(res, nums, 0);
        
        return res;
        
    }
    void backtrack( List<List<Integer>> res, int[] nums, int start)
    {
        if(start == nums.length)
        {
            res.add(toList(nums));
            
        }
        else
        {
            for(int i=start;i<nums.length;i++)
            {
                swap(i,start, nums);
                backtrack(res, nums, start+1);
                swap(i, start, nums);
            }
        }
    }
    
    List<Integer> toList(int[] nums)
    {
        List<Integer> res = new ArrayList<>();
        
        for(int i =0;i<nums.length;i++)
        {
            res.add(nums[i]);
        }
        return res;
    }
    
    void swap(int i, int j, int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}