import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
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
    public int minDepth(TreeNode root) {
        //本题的三种情况
//        1.root的left和right都为null，return 1
//        2.root的left或right有一个为null，return另一个不为空的
//        3.root的left和right都不为null，return较小的值

        if(root==null){
            return 0;
        }
        if(root.right==null&&root.left==null){
            return 1;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(root.left==null||root.right==null){
            return left+right+1;

        }
        return Math.min(left,right)+1;

    }
}