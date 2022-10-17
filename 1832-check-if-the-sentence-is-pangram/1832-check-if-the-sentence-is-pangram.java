class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans = false;
        
        for(char ch = 'a';ch<= 'z';ch++)
        {
            boolean tmp = check(ch,sentence);
            
            if(tmp == false)
            {
                ans = false;
                break;
            }
            else
                ans = true;
        }
        return ans;
    }
    
    boolean check(char ch, String str)
    {
        for(char i : str.toCharArray())
        {
            if(ch == i)
                return true;
        }
        
        return false;
    }
}