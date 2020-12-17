class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        if (root==null){
            return root;
        }
        connectnext(root.left,root.right);
        return root;
    }
    void connectnext(Node node,Node node1){
        if (node==null||node1==null){
            return;
        }
        node.next=node1;

        connectnext(node.left,node.right);
        connectnext(node1.left,node1.right);
        connectnext(node.right,node1.left);

    }
}