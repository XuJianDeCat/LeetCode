class Solution {
    public int removeDuplicates(int[] nums) {

            /*
            int length = nums.length; // ��ȡ����ĳ���
                    int index = 0; // һ���±�ָ��
                    int newIndex = 0; // �������±꣨Ҳ���Ǳ��� ����������±꣩
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
                nums[i] = nums[j]; // nums = [1,1,2],��һλ�϶��ǲ����޸ĵģ��������Ǵӵڶ�λ��ʼ�������ݣ���Ͳ��ܵڶ�λ�Ƿ�͵�һλ��ͬ�����Ǵӵڶ�λ��ʼ�������ݣ���Ҳ��i�ĳ�ʼֵ��1.
                i++;
            }
        }
        return i;
        
    }
    /* ��һ�ֽⷨ
    nums = [0,0,1,1,1,2,2,3,3,4]
    ͨ������whileѭ������ѭ����֤���Ա��������飬����ѭ����֤���԰�������ÿС���ظ�Ԫ�ظ������ų���������ѭ����������
    �Ϳ�ʼ����temp��һ��������������������õ����յ���������
    */
}