class Solution {
    public int findMin(int[] nums) {
        int first = 0;
        int end = nums.length-1;
        while(first<end){
            int mid = first + (end-first)/2;
            if(nums[end]<nums[mid])
            {
                first = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return nums[first];
    }
}