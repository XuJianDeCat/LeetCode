class Solution {
    public boolean containsDuplicate(int[] nums) {
        // �����������ų��Ƿ����ظ�Ԫ��,�������Լ�д��һ���ⷨ����ʼ���������Ҿ����Ⲣ���Ǻܺ�
        /*
        ִ����ʱ��
19 ms
, ������ Java �ύ�л�����
41.22%
���û�
�ڴ����ģ�
56 MB
, ������ Java �ύ�л�����
7.11%
���û�
         */
        // Arrays.sort(nums);
        // // for (int x : nums) {
        // //     System.out.println(x + " "); 
        // // }
       
        // int len = nums.length;
        // int temp = nums[0];
        // int flag = 1; // flag����1˵������û����ͬ��Ԫ�ء�
        // for (int i = 1; i < len; i++) {
        //     if (temp == nums[i]) {
        //         flag = 0;
        //         break;
        //     } else {
        //         temp = nums[i];
        //     }
        // }
        // if (flag == 1) return false;
        // else return true;

        // ʹ��Set�����е�ʵ����HashSet��ɢ�б��е�add()����,��������Ԫ���ظ��ͷ���false�����û���ظ��ͷ���true��
        // ����һ��HashSet ��ɢ�б���ص㣬Ԫ��������������Ψһ��
        Set<Integer> hashSet = new HashSet<Integer> ();
        // ��nums�����е�Ԫ�ش��������δ�ŵ�ɢ�б��У����������ӵ�Ԫ�����ظ��ͺ�����return true�����ߵȱ���������û���ظ�Ԫ�ؾ�return false
        for (int x : nums) {
            // �жϱ���ӽ�ɢ�б��Ԫ���Ƿ����ظ������û���ظ����ʹ���Ԫ�أ���ȥ�ж���һ��
            if (!hashSet.add(x)) {
                return true;
            }
        }
        // ����nums��������궼û���ظ���Ԫ�� ��return false
        return false;
    }
    /*
    ִ����ʱ��
���ܶ����Լ���
    */
}


