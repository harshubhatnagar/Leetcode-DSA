class Solution {
    public int numRollsToTarget(int n, int k, int target) {
         int[][] dp = new int[n+1][target + 1];
        
        dp[0][0] = 1;
        
        int mod = 1000000007;
        
        for(int i = 1;i<= n;i++)
        {
            for(int j = 1;j<= k;j++)
            {
                for(int l = target;l>=j;l--)
                {
                    if(dp[i-1][l - j] != 0)
                    {
                        dp[i][l] += dp[i-1][l-j];
                        dp[i][l] = dp[i][l]% mod;
                    }
                }
            }
        }
        
        
        return dp[n][target];
    }
}