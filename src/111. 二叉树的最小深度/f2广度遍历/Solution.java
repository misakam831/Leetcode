import java.util.LinkedList;
import java.util.Queue;

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
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){return 0;}
        q.offer(root);
        int depth=1;
        while (!q.isEmpty()){
            int sz= q.size();
            for (int i=0;i<sz;i++){
                TreeNode cur= q.poll();
                if(cur.left==null&&cur.right==null){
                    return depth;
                }
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);

                }
            }
            depth++;
        }
        return depth;

    }
}