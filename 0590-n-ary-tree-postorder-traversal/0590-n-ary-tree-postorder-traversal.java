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
    public List<Integer> postorder(Node root) {
        if (root == null) return List.of();
        
        List<Integer> integers = new ArrayList<>();
            
        for (Node aChildren : root.children) {
            integers.addAll(this.postorder(aChildren));
        }
        
        integers.add(root.val);
        return integers;
    }
}