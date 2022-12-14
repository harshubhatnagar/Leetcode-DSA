/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> res = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
        if(root == null)
            return res;
        
        helper(root);
         return res;
    }
    
    public void helper(Node node)
    {
        if(node.children == null)
            return ;
        
        res.add(node.val);
        
        for(Node child : node.children)
            helper(child);
    }
}