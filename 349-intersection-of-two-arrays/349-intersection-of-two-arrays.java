class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num :nums1)
        {
            set.add(num);
        }
        
        HashSet<Integer> Intersection = new HashSet<>();
        
        for(int num : nums2){
            if(set.contains(num))
                Intersection.add(num);
        }
        int[] res = new int[Intersection.size()];
        int ind =0;
        
        for(int i : Intersection)
        {
            res[ind++] = i;
        }
        return res;
    }
}