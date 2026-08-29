class Solution {
    public int findPeakElement(int[] nums) {
       int first = 0, end = nums.length-1;
       while(first < end ){
        int mid = first + (end - first )/2;
        if(nums[mid]<nums[mid+1]){
            first = mid + 1;
        }
        else {
            end = mid;
        }
       } 
       return first;
    }
}