//给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。 
//
// 换句话说，第一个字符串的排列之一是第二个字符串的子串。 
//
// 示例1: 
//
// 
//输入: s1 = "ab" s2 = "eidbaooo"
//输出: True
//解释: s2 包含 s1 的排列之一 ("ba").
// 
//
// 
//
// 示例2: 
//
// 
//输入: s1= "ab" s2 = "eidboaoo"
//输出: False
// 
//
// 
//
// 注意： 
//
// 
// 输入的字符串只包含小写字母 
// 两个字符串的长度都在 [1, 10,000] 之间 
// 
// Related Topics 双指针 Sliding Window 
// 👍 221 👎 0


package cn;

import java.util.*;

//Java：字符串的排列
class P567PermutationInString{
    public static void main(String[] args) {
        Solution solution = new P567PermutationInString().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            Map<Character,Integer> need = new HashMap<>();
            Map<Character,Integer> work = new HashMap<>();
            for(char ch:s1.toCharArray()){
                need.put(ch,need.getOrDefault(ch, 0) + 1);
            }
            int left = 0, right = 0;
            int count = 0;
            while(right<s2.length()){
                char right_char = s2.charAt(right);
                right++;
                if(need.containsKey(right_char)){
                    work.put(right_char, work.getOrDefault(right_char,0)+ 1);
                    if(Objects.equals(work.get(right_char), need.get(right_char))){
                        count++;
                    }

                }
                while(right - left >= s1.length()){
                    if(count == need.size()){
                        return true;
                    }
                    char left_char = s2.charAt(left);
                    left++;
                    if(need.containsKey(left_char)){
                        if(Objects.equals(work.get(left_char), need.get(left_char))){
                            count--;
                        }
                        work.put(left_char,work.get(left_char)-1);
                    }
                }
            }
            System.out.println(count);
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}

