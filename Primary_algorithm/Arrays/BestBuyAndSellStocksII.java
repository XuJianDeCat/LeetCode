class Solution {
    public int maxProfit(int[] prices) {
        //  设置一个dp二维数组，dp[i][0]和dp[i][1]分别为持有股票和没有持有股票的两种状态
        int[][] dp = new int[prices.length][2];
 
 /*

        1、dp[i][0]代表的含义是：第i天持有股票的最大金额
        它有两种状态
        (1)当天买入股票负债，有可能有两种，第一种是之前一次也没有买卖股票的最大金额为0来买股票，第二种是之前买卖过多次股票并且现在是没有买股票的最大金额来买股票（也就是说用卖了股票的钱来买股票） --->  dp[i - 1][1] -prices[i]
        (2)保持前几天买入股票之后最大金额 ---> dp[i - 1][0]
        2、dp[i][1]代表的含义是：第i天不持有股票的最大金额
        (1)当天卖出股票赚钱加上之前持有股票的最大金额 ---> dp[i - 1][0] + prices[i]
        (2)保持前几天卖出股票之后的金额 ---> dp[i - 1][1]
        
        */
        // 第二步递推公式
        // 初始化数据
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        // for循环
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1],dp[i - 1][0] + prices[i] );
           
            System.out.print(dp[i][0]);
            System.out.print(dp[i][1]);
        }
        
            return dp[prices.length - 1][1];
        
    }

}
// public class Solution {

//     public int maxProfit(int[] prices) {
//         int len = prices.length;
//         if (len < 2) {
//             return 0;
//         }

//         // 0：持有现金
//         // 1：持有股票
//         // 状态转移：0 → 1 → 0 → 1 → 0 → 1 → 0
//         int[][] dp = new int[len][2];

//         dp[0][0] = 0;
//         dp[0][1] = -prices[0];

//         for (int i = 1; i < len; i++) {
//             // 这两行调换顺序也是可以的
//             dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//             dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
//                         System.out.print(dp[i][0]);
//             System.out.print(dp[i][1]);
//         }
//         return dp[len - 1][0];
//     }
// }
