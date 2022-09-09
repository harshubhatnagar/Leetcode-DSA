class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b) -> b[0] == a[0] ? b[1] - a[1] : a[0] - b[0]);
        
        int res = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = properties.length -1 ;i>=0;i--)
        {
            if(properties[i][1] < max)
                res++;
            else
                max = properties[i][1];
            
        }
        
        return res;
    }
}