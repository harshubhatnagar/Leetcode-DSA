class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         int wordind1 =0,wordind2=0;
        int i = 0,j=0;
        
        while(wordind1<word1.length && wordind2 < word2.length)
        {
            
            if(word1[wordind1].charAt(i) != word2[wordind2].charAt(j))
                return false;
            i++;
            j++;
            
            if(i == word1[wordind1].length())
            {
                i =0;
                wordind1++;
            }
             if(j == word2[wordind2].length())
            {
                j =0;
                wordind2++;
            }
                
        }
        
        return wordind1 == word1.length && wordind2 == word2.length;
    }
}