class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int a = 0; a < nums.length - 2; a++) {

            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }

            int s = a + 1;
            int e = nums.length - 1;

            while (s < e) {

                int sum = nums[a] + nums[s] + nums[e];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[a], nums[s], nums[e]));

                    s++;
                    e--;

                    while (s < e && nums[s] == nums[s - 1]) {
                        s++;
                    }

                    while (s < e && nums[e] == nums[e + 1]) {
                        e--;
                    }

                } else if (sum < 0) {
                    s++;
                } else {
                    e--;
                }
            }
        }

        return result;
    }
}