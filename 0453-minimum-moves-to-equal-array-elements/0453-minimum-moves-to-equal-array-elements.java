class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <min) min = num;
        }
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            ans += nums[i] - min;
        }
        return ans;
    }
}