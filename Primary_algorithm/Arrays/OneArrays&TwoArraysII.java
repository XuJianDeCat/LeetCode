class Solution {
    int MAX = 10000;
    public int[] intersect(int[] nums1, int[] nums2) {
        // ����Ϊ����ô�죬ʱ�临�Ӷ�ΪO(N^2)
        // �ж����������Ǹ�����ĳ������
        if (nums1.length <= nums2.length) {
           return function(nums1, nums2);
        
        } else {
           return function(nums1, nums2);
           
        }

    }
    public int[] function(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
           for (int i = 0; i < nums1.length; i++) {
               for (int j = 0; j < nums2.length; j++) {
                   if (nums1[i] == nums2[j]) {
                       nums2[j] = MAX;
                      // nums3[k] = nums1[i];
                        list.add(nums1[i]);
                       break;
                   }
               }
           }
           // ��ArrayList�еĽ���ŵ�nums3���ս����������
           int[] nums3 = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                nums3[i] = list.get(i);
            }
           return nums3;
    }
    // ��⣬Ŀ����ȡ�����������鳤��С��һ��ȥ���鳤��һ�����Ƿ�����ͬ��ֵ������У��򽫸ո��ڳ��������ҵ���ֵ��Ϊ���������10000�������Ұ����鳤��С��һ���Ľ���ֵ�浽ArrayList�����б��档
    // ��ô������Ҫ���ؽ��������ľ��峤�ȣ�����������ʼ�������޷�ȷ���ģ�������Ҫʹ�ÿɱ��ArrayList������������Ȼ���ٰѽ�����浽������������ȥ��
}


