class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

            for (int i = len - 1; i >= 0; i--) {
                // �Ż���ѭ����Ҳ����˵��λ�˲���99,999���������439��ѭ������
                digits[i]++;
                digits[i] %= 10; // ���digits[i] % 10�Ľ��������0������ζ��û��
                if (digits[i] != 0) {
                    return digits;
                    }
                
            }
            digits = new int[len + 1];
            digits[0] = 1;
            return digits;
        // �ȶ�����Ŀ��˼�������Ҫ��
        // �Ӵ�ֹ��Ͽ���Ŀ���ܷ������������������д���롣
        // �����һ����������ұߵ�����Ԫ��С��9���ߴ��ҿ�ʼ��9Ԫ�صĲ�����
        // ���ӣ�432,483499��33449039
        // �ڶ��֣�ȫ��9
        // ���ӣ�9,99��999��9999
        
    }
}