class Solution {
    boolean[][] seen;
    public int maxAreaOfIsland(int[][] grid) {
        int res_max = 0;
        
        int row = grid.length;
        int col = grid[0].length;
        
        seen = new boolean[row][col];
        
        for(int i =0 ;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                res_max = Math.max(res_max,area(i,j,grid));
            }
        }
        
        return res_max;
    }
    
    public int area(int r, int c,int[][] grid)
    {
        if(r < 0 || r >= grid.length ||
           c < 0 || c >= grid[r].length||
          seen[r][c] || grid[r][c] == 0)
            return 0;
        
        
        seen[r][c] = true;
        
        return (1 + area(r-1,c,grid) +area(r+1,c,grid) +area(r,c-1,grid) +area(r,c+1,grid) );
    
    }
}