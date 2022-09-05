class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int start =0;
        int res = 0;
        
        for(int end =0;end< s.length();end++)
        {
            char ch = s.charAt(end);
            
            if(map.containsKey(ch))
            {
                if(start <= map.get(ch))
                    start = map.get(ch) + 1;
            }
            
            res = Math.max(res,end - start +1);
            map.put(ch,end);
        }
        
        return res;
    }
}