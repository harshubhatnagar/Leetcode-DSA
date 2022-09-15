class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 != 0)
            return new int[]{};
        
        
        int half = changed.length/2;
        int[] res = new int[half];
        int[] freq = new int[100001];
        
        for(int i : changed)
        {
            freq[i]++;
        }
        
        int ind =0;
        
        for(int i =0;i<freq.length;i++)
        {
            while(freq[i] > 0 && i*2 < 100001 && freq[i*2] > 0   )
            {
                freq[i]--;
                freq[i*2]--;
                if(freq[i*2] < 0)
                    return new int[]{};
               res[ind++] = i; 
            }
            
            
            
            
        }
        for(int i =0;i<freq.length;i++)
        {
            if(freq[i] != 0)
                return new int[]{};
            
        }
        return res;
        
        }
}