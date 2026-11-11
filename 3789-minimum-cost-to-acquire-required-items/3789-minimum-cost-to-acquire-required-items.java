class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        long com = (long)Math.min(costBoth, cost1+cost2);
        long b = (long)Math.min(need1, need2);
        ans = b*com;
        if(need1 - need2 >0){
            ans += (long)(need1- need2)*Math.min(costBoth, cost1);
        }else ans += (long)(need2- need1)*Math.min(costBoth, cost2);
        return ans;
    }
}