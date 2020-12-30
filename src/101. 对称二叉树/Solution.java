class TreeNode { int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return fun(root.left,root.right);
    }
    public boolean fun(TreeNode root,TreeNode root2){
        if(root==null&&root2==null){
            return true;
        }
        if(root==null||root2==null||root!=root2){
            return false;
        }
        return fun(root.left,root2.right)&&fun(root.right,root2.left);
    }
}