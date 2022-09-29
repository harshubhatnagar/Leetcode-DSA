class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length -1;
        
        while(end - start >= k)
        {
            if(arr[start] - x >= x - arr[end])
                end--;
            else
                start++;
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=start;i<= end;i++)
        {
            res.add(arr[i]);
        }
        
        return res;
    }
}