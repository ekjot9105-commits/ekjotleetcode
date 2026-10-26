class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        long len = 0;
        for (int x : nums) {
            if (x >= minK && x <= maxK) {
                len++;
                ans += len; 
            } else {
                len = 0;
            }
        }
        return ans;
    }
}