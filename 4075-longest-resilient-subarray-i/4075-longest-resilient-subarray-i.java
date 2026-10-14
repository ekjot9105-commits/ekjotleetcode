class Solution {
    public int resilientSubarray(int[] nums, int k) {

        int ans = 1;
        int len = 1;

        for (int i = 1; i < nums.length; i++) {

            int currRem = nums[i] % k;
            int prevRem = nums[i - 1] % k;

            if (currRem == prevRem) {
                len++;
            } else {
                len = 1;
            }

            int r = currRem;

            if (((long)(len - 1) * r) % k == 0) {
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}