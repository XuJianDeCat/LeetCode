class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            List<Integer> list = new ArrayList<>();
            
                int i = 0;
                int j = 0;
                while (i != m && j != n) {
                    if (nums1[i] < nums2[j]) {
                        list.add(nums1[i]);
                        i++;
                    } else if(nums1[i] > nums2[j]) {
                        list.add(nums2[j]);
                        j++;
                    } else {
                        list.add(nums1[i]);
                        list.add(nums1[i]);
                        i++;
                        j++;
                    }
                }
                if (i < m) {
                    for (; i < m; i++) {
                        list.add(nums1[i]);
                    }
                } 
                if (j < n) {
                    for (; j < n; j++) {
                        list.add(nums2[j]);
                    }
                }
                for (int k = 0; k < m + n; k++) {
                    nums1[k] = list.get(k);
                }
                

/*
总结：直接把两个数组中的数字来慢慢比较，将小一点的数字放到list集合中，然后将排好序的list集合中的数字放到nusm1中。
*/

    }
}