class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< HashMap<Character,Integer >, ArrayList<String> > map = new HashMap<>();
        
        for(String s : strs)
        {
            HashMap<Character,Integer> temp = new HashMap<>();
            
            for(int i =0 ;i<s.length();i++)
            {
                if(temp.containsKey(s.charAt(i)))
                {
                    int a = temp.get(s.charAt(i));
                    temp.put(s.charAt(i), a+1);
                }
                else{
                    temp.put(s.charAt(i),1);
                }
            }
            
            
            if(map.containsKey(temp))
                map.get(temp).add(s);
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(temp,list);
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        
        for(HashMap<Character,Integer > i : map.keySet())
            res.add(map.get(i));
        
        
        return res; 
    }
}