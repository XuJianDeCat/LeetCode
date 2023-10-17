class Solution {
    public int climbStairs(int n) {
        int[] array = new int[n + 2];
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
    /*
        总结：我使用递归超时了，递归肯定比for循环要更多的时间，但是我使用for循环又忘了怎么处理把结果加起来，使用数组是最好理解的。这种在动态规划中使用最多的。
    */
}