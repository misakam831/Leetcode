import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        int count=0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
            if(nums[i]==0){
                count++;
            }

        }
        while (count>0){
            nums[nums.length-count]=0;
            count--;
        }
    }
}
