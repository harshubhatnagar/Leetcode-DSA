class Solution {
    public void rev(char[]s , int i,int j)
    {
        for(;i<j;i++,j--)
        {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
    public String reverseWords(String s) {
        if(s == null || s.length() == 0)
            return s;
        
        char[]str = s.toCharArray();
        
        int l =0;
        int r=0;
        
        while(r <=str.length)
        
            {
            if(r == str.length || str[r] == ' ' )
            {
                rev(str,l,r-1);
                l = r+1;
                
            }
                r++;
        }
            
            return new String(str);
    }
}