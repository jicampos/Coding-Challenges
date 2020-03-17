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
        
        List<List<Integer>> res = new LinkedList<>();
        Queue<Node> q = new LinkedList();
        
        if(root == null) return res;
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> lvl = new LinkedList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                Node node = q.remove();
                lvl.add(node.val);
                for(Node n: node.children)
                    q.add(n);
            }
            res.add(lvl);
        }
        return res;        
    }
}