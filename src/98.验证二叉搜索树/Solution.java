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
    public boolean isValidBST(TreeNode root) {
        return  BST(root,null,null);
    }
    public boolean BST(TreeNode root,Integer lower,Integer higher ){
        if(root==null){
            return true;
        }
        else if(lower!=null&&lower>=root.val){
            return false;
        }
        else if(higher!=null&&higher<=root.val){
            return false;
        }
        return  BST(root.left,lower,root.val)&&BST(root.right,root.val,higher);
    }
}