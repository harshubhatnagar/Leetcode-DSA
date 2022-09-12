class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        
        return path(m,n,dp);
    }
    public int path(int m, int n, int[][] dp)
    {
        if(m == 1 || n == 1)
        return 1;
        
        if(dp[m][n] != 0)
            return dp[m][n];
        
        
        return dp[m][n] = path(m-1,n,dp) + path(m,n-1,dp);
        
    }
}