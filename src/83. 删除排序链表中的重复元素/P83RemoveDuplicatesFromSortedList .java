//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表 
// 👍 454 👎 0


package cn;
//Java：删除排序链表中的重复元素
public class P83RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {
        Solution solution = new P83RemoveDuplicatesFromSortedList().new Solution();
        // TO TEST
    }

    public class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null){
            if(fast.val!=slow.val){
                slow.next=fast;
                slow=slow.next;

            }
            fast=fast.next;
        }
        slow.next=null;
        return head;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

