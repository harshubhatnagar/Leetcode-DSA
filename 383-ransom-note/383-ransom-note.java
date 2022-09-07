class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chCount = new int[26];
        
        for(int i=0;i<magazine.length();i++)
        {
            char ch = magazine.charAt(i);
            chCount[ch - 'a']++;
        }
        
        
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch = ransomNote.charAt(i);
            if(--chCount[ch - 'a'] < 0)
                return false;
        }
        
        return true;
    }
}