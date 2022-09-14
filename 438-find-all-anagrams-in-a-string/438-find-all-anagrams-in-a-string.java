class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length())
            return new ArrayList<>();
        
        
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        
        List<Integer> res = new ArrayList<>();
        
        for(char ch : p.toCharArray())
            pCount[ch - 'a']++;
        
        
        int pLen = p.length();
        char[] ch = s.toCharArray();
        
        for(int i =0;i<pLen - 1;i++)
            sCount[ch[i] - 'a']++;
        
        
        for(int i=pLen - 1;i< ch.length ;i++)
        {
            sCount[ch[i] - 'a']++;
            
            if(anagram(pCount,sCount))
                res.add(i - pLen + 1);
            
            sCount[ch[i - pLen + 1] - 'a']--;
            
            
        }
        
        
        
        return res;
        
    }
    boolean anagram(int[] p, int[] s )
    {
        for(int i =0 ;i<26;i++)
        {
            if(p[i] != s[i])
                return false;
        }
        
        return true;
    }
}