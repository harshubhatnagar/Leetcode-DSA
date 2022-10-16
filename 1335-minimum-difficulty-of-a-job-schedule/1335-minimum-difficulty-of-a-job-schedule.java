class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if(jobDifficulty.length < d)
            return -1;
        
        
        int[][] dp = new int[d+1][jobDifficulty.length];
        
        for(int[] p :dp)
        {
            Arrays.fill(p, -1);
        }
        
        return dfs(jobDifficulty, dp, d, 0);
    }
    
    public int dfs(int[] job, int[][] dp, int d, int ind)
    {
        if(d == 1)
        {
            int max =0;
            while(ind < job.length)
            {
                max = Math.max(max, job[ind++]);
                
            }
            return max;
            
        }
        
        
        if(dp[d][ind] != -1)
        {
            return dp[d][ind];
        }
        
        int res = Integer.MAX_VALUE;
        int leftMax =0;
        for(int i = ind;i< job.length - d + 1;i++)
        {
            leftMax = Math.max(leftMax, job[i]);
            int rightMax = dfs(job, dp, d-1, i+1);
            res = Math.min(res, leftMax + rightMax);
        }
        return dp[d][ind] = res;
        
    }
}