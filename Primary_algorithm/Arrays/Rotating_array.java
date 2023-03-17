class Solution {
    public void rotate(int[] nums, int k) {
        // 最暴力的解法,超时
        // int len = nums.length;
        // for (int i = 0; i < k; i++) {
        //     int temp = nums[len - 1];
        //     for (int j = len -1; j > 0; j--) {
        //         nums[j] = nums[j - 1];
        //     }
        //     nums[0] = temp;
        // }
        int len = nums.length;
        //  如果我不用下面这行会出错吗？,答：是会出错的，因为将数组中的元素向右轮转 k 个位置，这个意思是K这个数值是可以大于nums数组的长度的，比如k = 8，这个其实和k=1的效果一样，所以下面的代码需要打开。
         k %= len;
        // 下面我将进行三次函数反转
        //第一次数组中所有的元素都反转
        reversal(nums, 0, len - 1);
        // 第二次数组中下标k-1前面的元素反转
        reversal(nums, 0, k - 1);
        // 第三次数组中下标K-1后面的元素反转
        reversal(nums, k, len - 1);
    }
    public void reversal(int[] nums, int start, int end) {
                while (start < end) {
                    int temp = nums[end];
                    nums[end] = nums[start];
                    nums[start] = temp;
                    start++;
                    end--;
                }
    }
}