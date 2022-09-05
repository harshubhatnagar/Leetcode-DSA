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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        //check whether there is a N-Array tree or not
        if(root == null)
            return ans;
        
        Queue<Node> q = new LinkedList<>();
        // Adding root node in Queue q 
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            // for list to be added in #List<List<Integer>> ans#
            List<Integer> levelNode = new ArrayList<>();
            
            while(size-- > 0)
            {
                //get the first first at the top and add into List 
                Node head = q.poll();
                levelNode.add(head.val);
                
                for(Node child : head.children)
                {
                    // if we have any child of current head node 
                    //it must be pushed into queue so that it can be traversed during next 
                    // iteration and the process is repeated till head.val becomes null or                            there is no child to current node 
                    q.offer(child);
                }
            }  
            
            ans.add(levelNode);
        }
        
        
        return ans;
        
    }
}