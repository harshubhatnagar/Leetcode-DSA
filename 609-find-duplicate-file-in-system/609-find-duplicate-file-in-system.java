class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        Map<String, List<String>> store = new HashMap<>();
        
        for(String path: paths)
        {
            
            String[] arr = path.split(" ");
            
            String dict = arr[0];
            
            for(int i = 1; i < arr.length;i++)
            {
                String fileName = arr[i].substring(0, arr[i].indexOf("("));
                String context = arr[i].substring(arr[i].indexOf("("), arr[i].length() - 1);
                
                List<String> filepaths = store.getOrDefault(context, new ArrayList<>());
                filepaths.add(dict + "/" + fileName);
                store.put(context, filepaths);
                
            }
        }
        
        
        store.entrySet().removeIf(entry -> entry.getValue().size() < 2);
        
        
        return new ArrayList<>(store.values());
        
        
    }
}