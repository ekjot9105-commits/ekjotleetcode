class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int com = nums[0];
        for(int i =1; i<nums.length; i++){
            ans += nums[i] - com;
        }
        return ans;
    }
}