class Solution {
    public int singleNumber(int[] nums) {
// ʱ�䣺O(n)
// �ռ䣺O(1)
// ����
   // �������ֻ��һλ����ֱ�ӷ���
//    if (nums.length == 1) {
//        return nums[0];
//    }
//    // ����ĳ���
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
// ��������⣬�㷨�����̫���ˡ�
/*
    �������ô���������أ�
    �������еĳ�����һ��Ԫ���ǵ������ֵģ�������Ԫ�ض��ǳɶԳ��ֵģ���ô��ʹ����������ȫ�������������Ϳ��԰���һ��������Ԫ���������
    �ٸ����ӣ���������--��nums = [4,1,2,1,2]
    �����е�����Ԫ�ض���������ȥ�����������Ϳ��Եõ�������Ҫ�Ľ���ˡ�
    result = 4^1^2^1^2
    result = 4
*/
     // �������ĳ�����1����ֱ�ӷ�����һ��Ԫ�أ�����Ҫ���Ǻúõ�ȥ���⡣
     int ans = nums[0];
     if (nums.length > 1) {
         for (int i = 1; i < nums.length ;i++) {
            ans ^= nums[i];
         }
     }
     return ans;

    }
}