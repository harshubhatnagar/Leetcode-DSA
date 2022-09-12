class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int start =0;
        int end = tokens.length-1;
        
        int score =0;
        
        while(start <= end){
            if(tokens[start] <= power)
            {
                score++;
                power = power - tokens[start++];
            }
            else {
                if(power + tokens[end] >= tokens[start] && score!= 0 && end != start)
                {
                    power += tokens[end--];
                    score--;
                    
                }
                else
                    break;
            }
        }
        return score;
    }
}