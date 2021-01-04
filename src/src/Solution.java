import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list= new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList();
        q.offer(root);
        while (!q.isEmpty()){
            int sz= q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur= q.poll();
                if(i==sz-1){
                    list.add(cur.val);
                }
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }

            }

        }
        return list;
    }
}