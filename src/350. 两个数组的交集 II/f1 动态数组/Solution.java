import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for (int i:nums1){
            list.add(i);
        }
        for (int j:nums2){
            if (list.contains(j)){
                list1.add(j);
                list.remove(Integer.valueOf(j));
            }

        }
        int[] s1 = new int[list1.size()];
        int i=0;
        for (int num:list1){
            s1[i++]=num;


        }
        return s1;


    }
}