class Solution {
  public int maxSubArray(int[] nums) {


        // 确定正确的状态
//        int[] dp = new int[nums.length];

        // dp[i]:前提是从0下标到i下标的数组，dp[i]是(从0下标到i下标的数组)连续到nums[i]的值
        // 以i为右端点的数组
        // 状态转移方程，如果dp[i-1]小于零，那么就不需要再dp[i-1]+nums[i] = dp[i],因为加上去不管你nums[i]大于零还是小于零都会导致dp[i]的结果变小。
        // dp[i] = Math.math(dp[i - 1],0) + nums[i];

        // 确定初始条件以及边界条件
        // 优化内存
        int dp1 = nums[0];
        int dp2 = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp2 = Math.max(dp1,0) + nums[i];
            dp1 = dp2;
            max = Math.max(max, dp2);
        }

        return max;
    }
}