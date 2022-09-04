/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Location> loc = null;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        loc = new ArrayList<>();
        dfs(root,0,0);
        
        Collections.sort(loc);
        
        int x = loc.get(0).x;
        
        res.add(new ArrayList<>());
        
        for(Location l :  loc)
        {
            if(x!= l.x)
            {
                x = l.x;
                res.add(new ArrayList<>());
            }
            res.get(res.size() -1).add(l.val);
        }
        
        return res;
    }
    
    public void dfs(TreeNode root, int x, int y)
    {
        if(root != null){
            loc.add(new Location(x,y,root.val));
        dfs(root.left,x-1,y-1);
        dfs(root.right,x+1, y-1);
        }
        
    }
    
    class Location implements Comparable<Location>{
        int x,y,val;
        
        Location(int x, int y, int val)
        {
            this.x =x;
            this.y = y;
            this.val = val;
        }
        
        @Override
        public int compareTo(Location l)
        {
            if(this.x != l.x){
                return Integer.compare(this.x,l.x);
            }
            
            if(this.y != l.y)
                return Integer.compare(l.y,this.y);
            else
                return Integer.compare(this.val, l.val);
        }
    } 
    
}