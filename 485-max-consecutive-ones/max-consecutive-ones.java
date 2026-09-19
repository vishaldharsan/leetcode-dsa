class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0,max=0;
        for(int i:nums){
            if(i==1){
                sum++;
            }
            else{
                sum=0;
            }
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }
}