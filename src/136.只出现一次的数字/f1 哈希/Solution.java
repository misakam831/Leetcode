import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if (set.add(i)==false){
                set.remove(i);
            }
        }
        return set.iterator().next();
    }
}
