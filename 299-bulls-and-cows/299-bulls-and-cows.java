class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        
        int[] secretFreq = new int[10];
        int[] guessFreq = new int[10];
        
        for(int i =0;i<secret.length();i++)
        {
            char secretCh = secret.charAt(i);
            char guessCh = guess.charAt(i);
            
            if(secretCh == guessCh)
                bulls++;
            else
            {
                secretFreq[secretCh - '0']++;
                guessFreq[guessCh - '0']++;
            }
            
            
        }
        
        for(int i=0;i<10;i++)
        {
            cows += Math.min(secretFreq[i], guessFreq[i]);
        }
        
        return bulls + "A" + cows + "B";
    }
}