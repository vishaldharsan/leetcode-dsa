import java.util.Arrays;
class Solution {
    public void sortColors(int[] nums) {
        int f = 0;
        int m = 0;
        int h = nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                int temp = nums[f];
                nums[f]  = nums[m];
                nums[m]  = temp;
                m++;
                f++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;
                h--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}