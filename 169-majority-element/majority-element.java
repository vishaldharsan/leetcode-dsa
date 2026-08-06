class Solution {
    public int majorityElement(int[] nums) {
        int count = 0,majority = 0;
        for(int i:nums){
            if(count == 0){
                majority = i;
            }
            if(majority == i){
                count++;
            }
            else{
                count--;
            }
        }
        return majority;
    }
}