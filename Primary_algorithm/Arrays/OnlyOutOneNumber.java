class Solution {
    public int singleNumber(int[] nums) {
// 时间：O(n)
// 空间：O(1)
// 排序
   // 如果数组只有一位，就直接返回
//    if (nums.length == 1) {
//        return nums[0];
//    }
//    // 数组的长度
//    int len = nums.length;
//    int result = 0;
//    int i;
//    Arrays.sort(nums);
//    for ( i = 0; i < len - 1; ) {
//        if (nums[i] == nums[i + 1]) {
//            i += 2;
//        } else {
//            result = nums[i];
//            break;
//        }
//    }
//    if (i == len - 1) {
//        return nums[len - 1];
//    } else {
//        return result;
//    }
/*

*/
// 异或解决问题，算法真的是太六了。
/*
    异或是怎么解决问题的呢？
    当数组中的除了那一个元素是单独出现的，其他的元素都是成对出现的，那么就使用异或把他们全部都连起来，就可以把那一个单独的元素求出来。
    举个梨子：如这数组--》nums = [4,1,2,1,2]
    将其中的所有元素都用异或符号去连接起来，就可以得到我们想要的结果了。
    result = 4^1^2^1^2
    result = 4
*/
     // 如果数组的长度是1，就直接返回那一个元素，这需要我们好好的去审题。
     int ans = nums[0];
     if (nums.length > 1) {
         for (int i = 1; i < nums.length ;i++) {
            ans ^= nums[i];
         }
     }
     return ans;

    }
}