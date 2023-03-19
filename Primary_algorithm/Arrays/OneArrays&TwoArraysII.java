class Solution {
    int MAX = 10000;
    public int[] intersect(int[] nums1, int[] nums2) {
        // 交集为空怎么办，时间复杂度为O(N^2)
        // 判读两个数组那个数组的长度最短
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
           // 把ArrayList中的结果放到nums3最终结果的数组中
           int[] nums3 = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                nums3[i] = list.get(i);
            }
           return nums3;
    }
    // 题解，目的是取交集，由数组长度小的一方去数组长的一方找是否有相同的值，如果有，则将刚刚在长数组中找到的值置为无穷大数（10000），并且把数组长度小的一方的交集值存到ArrayList数组中保存。
    // 怎么解决最后要返回结果的数组的具体长度，这个长度在最开始我们是无法确定的，所以我要使用可变的ArrayList类来保存结果，然后再把结果保存到其他的数组中去。
}


