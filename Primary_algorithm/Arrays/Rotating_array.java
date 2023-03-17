class Solution {
    public void rotate(int[] nums, int k) {
        // ����Ľⷨ,��ʱ
        // int len = nums.length;
        // for (int i = 0; i < k; i++) {
        //     int temp = nums[len - 1];
        //     for (int j = len -1; j > 0; j--) {
        //         nums[j] = nums[j - 1];
        //     }
        //     nums[0] = temp;
        // }
        int len = nums.length;
        //  ����Ҳ����������л������,���ǻ����ģ���Ϊ�������е�Ԫ��������ת k ��λ�ã������˼��K�����ֵ�ǿ��Դ���nums����ĳ��ȵģ�����k = 8�������ʵ��k=1��Ч��һ������������Ĵ�����Ҫ�򿪡�
         k %= len;
        // �����ҽ��������κ�����ת
        //��һ�����������е�Ԫ�ض���ת
        reversal(nums, 0, len - 1);
        // �ڶ����������±�k-1ǰ���Ԫ�ط�ת
        reversal(nums, 0, k - 1);
        // �������������±�K-1�����Ԫ�ط�ת
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