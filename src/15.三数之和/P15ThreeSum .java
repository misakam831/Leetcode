//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2862 👎 0


package cn;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

//Java：三数之和
class P15ThreeSum {
    public static void main (String[] args) {
        Solution solution = new P15ThreeSum().new Solution();

        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum (int[] nums) {
            return threeSumTarget(nums,0);
        }
        public List<List<Integer>> threeSumTarget (int[] nums,int target) {
            Arrays.sort(nums);
            List<List<Integer>>list=new LinkedList<>();
            int length=nums.length;
            for (int i = 0; i < length; i++) {
                list=twosum(nums,i+1,target-nums[i]);
                for (List<Integer>list1:list
                ) {
                    list1.add(nums[i]);
                    list.add(list1);
                }

            }
            return list;
        }
        public List<List<Integer>> twosum(int [] nums, int start, int target){
            int lo=start;
            int hi=nums.length-1;
            List<List<Integer>>list=new LinkedList<>();
            List<Integer>list1=new LinkedList<>();
            while (lo<hi){
                int sum=nums[lo]+nums[hi];
                int left=nums[lo];
                int right=nums[hi];
                if(sum<target){

                }
                else if(sum>target){


                }
                else {
                    list1.add(left,right);
                    while (lo<hi&&lo==left){
                        lo++;
                    }
                    while (lo<hi&&hi==right){
                        hi--;
                    }
                }
            }
            list.add(list1);
            return list;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}

