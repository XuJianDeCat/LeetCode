class Solution {
    public int removeDuplicates(int[] nums) {

            /*
            int length = nums.length; // 获取数组的长度
                    int index = 0; // 一个下标指针
                    int newIndex = 0; // 新数组下标（也就是保存 结果的数组下标）
                    while (index < length) {
                        int temp = nums[index];
                        while (index + 1 < length && nums[index + 1] == temp) {
                            index++;
                        }
                        index++;
                        nums[newIndex++] = temp;
                    }
                    return newIndex;
            */
        int length = nums.length;
        int i = 1;
        for (int j = 1; j < length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j]; // nums = [1,1,2],第一位肯定是不用修改的，所以我们从第二位开始放入数据，这就不管第二位是否和第一位相同，都是从第二位开始放入数据，这也是i的初始值是1.
                i++;
            }
        }
        return i;
        
    }
    /* 第一种解法
    nums = [0,0,1,1,1,2,2,3,3,4]
    通过两个while循环，外循环保证可以遍历完数组，而内循环保证可以把数组内每小组重复元素给遍历排除掉，等内循环跳出来后，
    就开始保存temp（一个结果），依次类推最后得到最终的数组结果。
    */
}