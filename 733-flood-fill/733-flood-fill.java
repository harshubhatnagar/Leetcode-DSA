class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    // simple DFS solution
        if(image[sr][sc] == color)
            return image;
        fill(image,sr,sc,image[sr][sc], color);
        
        return image;
    }
    
    void fill(int[][] image, int sr, int sc, int prev, int color)
    {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || 
          image[sr][sc] != prev)
            return ;
        
        image[sr][sc] = color;
        fill(image ,sr -1 , sc, prev, color);
        fill(image ,sr +1, sc, prev, color);
        fill(image ,sr ,sc -1 , prev, color);
        fill(image ,sr ,sc +1 , prev, color);
         
    }
}