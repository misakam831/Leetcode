import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int length=stones.length-1;

        for (int i=length;i>0;i--){
            stones[length-1]=stones[length]-stones[length-1];
            stones[length]=0;
            Arrays.sort(stones);

        }
        return stones[length];
    }
}