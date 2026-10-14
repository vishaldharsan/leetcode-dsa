class Solution {
    public int longestSubarray(int[] nums) {
        int zero = 0;
        int left = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
            zero++;
           } 
           while(zero>1){
            if(nums[left]==0){
                zero--;
            }
            left++;
           }
           max = Math.max(max,i-left);
        }
        return max;
    }
}