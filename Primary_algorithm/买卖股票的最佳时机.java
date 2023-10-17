class Solution {
public int maxProfit(int[] prices) {
        // dp[i] 前i天最大的股票利润
        int dp[] = new int[prices.length + 1];
        // base case
        dp[0] = 0;
        int minPrices = prices[0];
        // 状态变化
        for (int i = 1; i <= prices.length; i++) {
            if (prices[i - 1] < minPrices) {
                minPrices = prices[i - 1];
            }
            // 状态转移方程
            dp[i] = Math.max(dp[i - 1], prices[i - 1] - minPrices);
        }
        return dp[prices.length];

    }
}
/*
总结：动态规划问题有一维，二维，多维数组很多种，dp[]代表的含义，等等，都让人感觉这是一种套路，还有子问题，重叠子问题，动态规划不就是一个优化暴力枚举的优化解吗？
不管是这题的自底向上的递推法，还是以后自顶向下的递归法。
*/