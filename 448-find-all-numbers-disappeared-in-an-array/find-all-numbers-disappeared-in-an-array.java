class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        // Step 1: Mark numbers as negative
        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            nums[index] = -Math.abs(nums[index]);
        }

        // Step 2: Find positive positions
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}