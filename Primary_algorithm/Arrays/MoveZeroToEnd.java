class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int flag1 = 0;
        // �ų�ȫΪ�������
        for (int i = 0; i < len; i++){
            if (nums[i] != 0) {
                flag1 = 1;
                break;
            }
        }
        if (flag1 == 0) {
            
        } else {

        // �ų�����Ϊ�������
        int flag2 = 0;
       for (int i = 0; i < len; i++){
            if (nums[i] == 0) {
                flag2 = 1;
                break;
            }
        }
         if (flag1 == 0) {
            
        } else {
             // ���ڵ�����������������ֵĻ���
        int i = 0,j = 0;
        for (; j < len; j++) {
            if (nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(; i < len; i++){
            nums[i] = 0;
        }
        }
       
        }
       
    }
}
// class Solution {
// 	public void moveZeroes(int[] nums) {
// 		if(nums==null) {
// 			return;
// 		}
// 		//��һ�α�����ʱ��jָ���¼��0�ĸ�����ֻҪ�Ƿ�0��ͳͳ������nums[j]
// 		int j = 0;
// 		for(int i=0;i<nums.length;++i) {
// 			if(nums[i]!=0) {
// 				nums[j++] = nums[i];
// 			}
// 		}
// 		//��0Ԫ��ͳ�����ˣ�ʣ�µĶ���0��
// 		//���Եڶ��α�����ĩβ��Ԫ�ض���Ϊ0����
// 		for(int i=j;i<nums.length;++i) {
// 			nums[i] = 0;
// 		}
// 	}
// }	
// 2023��3��21��23:07:16����ô˵�أ����˵�ȷʵ˼·ȷʵ�ã������ҿ��ǵ��������������һ�����档
//��Ͳ��ò���һ����֮ǰ�Ľ����뷨�ˣ����⣬����ȫ�֣������ȷȷʵʵ�������ĵ��� ����ȫ���Ƿ֣�����ȴû�п��Ǻͣ�Ϊʲô������������Էŵ�һ�����������˴���������������˽����ٶȡ�
