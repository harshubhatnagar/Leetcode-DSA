class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[k+1][n];
        
        if(n < 2)
            return 0;
        
        for(int i = 1;i<=k;i++)
        {
//             EBP = effective buy price => prices[j] - previous profit 
            int EBP = prices[0];
            for(int j =1;j<n;j++)
            {
                dp[i][j] = Math.max(dp[i][j-1],prices[j] - EBP );
                EBP =Math.min(EBP,prices[j] - dp[i-1][j]);
            }
        }
        
        
        
        
        return dp[k][n-1];
    }
}