class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : nums){
            sum += num;
            q.add(getMax(num) - num);
        }
        while(k>0 && !q.isEmpty() && q.peek() > 0){
            sum += q.poll();
            k--;
        }
        return sum;
    }
    public int getMax(int num){
        int[] digit = new int[10];
        while(num>0){
            digit[num%10]++;
            num/=10;
        }
        int ans =0;
        for(int i = 9; i>=0; i--){
            while(digit[i]>0){
                ans = ans*10 +i;
                digit[i]--;
            }
        }
        return ans;
    }
}