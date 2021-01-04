//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 306 👎 0


package cn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//Java：两个数组的交集
class P349IntersectionOfTwoArrays{
    public static void main(String[] args) {
        Solution solution = new P349IntersectionOfTwoArrays().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet=new HashSet<>();
        HashSet<Integer> hashSet1=new HashSet<>();
        List<Integer> list=new LinkedList<>();
        for (int nums:nums1
             ) {
            hashSet.add(nums);
        }
        for (int nums:nums2
             ) {
            if(hashSet.contains(nums)){
                hashSet1.add(nums);
            }

        }
        int[] s1 = new int[hashSet1.size()];
        int i=0;
        for (int num:hashSet1){
            s1[i++]=num;
        }
        return s1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

