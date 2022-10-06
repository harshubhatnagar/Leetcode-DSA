class TimeMap {

    HashMap<String, HashMap<Integer, String>> keyTime;
    public TimeMap() {
        keyTime = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keyTime.containsKey(key))
            keyTime.put(key, new HashMap<Integer, String>());
    
    keyTime.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!keyTime.containsKey(key))
        {
            return "";
        }
        
        for(int i = timestamp;i >= 1;--i)
        {
            if(keyTime.get(key).containsKey(i))
            {
                return keyTime.get(key).get(i);
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */