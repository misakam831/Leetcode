import java.util.*;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int count=0;
        while (!q.isEmpty()){
            int sz= q.size();
            List<Integer> list1=new LinkedList<>();
                for (int i = 0; i < sz; i++) {
                    TreeNode cur= q.poll();
                    list1.add(cur.val);
                    if(cur.left!=null){
                        q.offer(cur.left);
                    }
                    if(cur.right!=null){
                        q.offer(cur.right);
                    }
                }
            count++;
            if((count&1) != 1){
                Collections.reverse(list1);
                list.add(list1);
            }
            else {
                list.add(list1);
            }
        }
        return list;
    }
}