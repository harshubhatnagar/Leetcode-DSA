class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        if(rows*cols != r*c)
            return mat;
        
        int row =0;
        int col =0;
        int[][] res = new int[r][c];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(col == c)
                {
                    row++;
                    col =0;
                }
                res[row][col] = mat[i][j];
                col++;
            }
        }
        
        return res;
    }
}