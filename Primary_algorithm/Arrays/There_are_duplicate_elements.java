class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 先排序再做排除是否有重复元素,这是我自己写的一个解法，开始先用排序我觉得这并不是很好
        /*
        执行用时：
19 ms
, 在所有 Java 提交中击败了
41.22%
的用户
内存消耗：
56 MB
, 在所有 Java 提交中击败了
7.11%
的用户
         */
        // Arrays.sort(nums);
        // // for (int x : nums) {
        // //     System.out.println(x + " "); 
        // // }
       
        // int len = nums.length;
        // int temp = nums[0];
        // int flag = 1; // flag等于1说明数组没有相同的元素。
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

        // 使用Set集合中的实现类HashSet，散列表中的add()方法,如果加入的元素重复就返回false，如果没有重复就返回true。
        // 设置一个HashSet ：散列表的特点，元素在里面无序并且唯一。
        Set<Integer> hashSet = new HashSet<Integer> ();
        // 将nums数组中的元素从左到右依次存放到散列表中，如果发现添加的元素有重复就函数就return true，否者等遍历完数组没有重复元素就return false
        for (int x : nums) {
            // 判断被添加进散列表的元素是否有重复，如果没有重复，就存入元素，再去判断下一个
            if (!hashSet.add(x)) {
                return true;
            }
        }
        // 若将nums数组遍历完都没有重复的元素 就return false
        return false;
    }
    /*
    执行用时：
能跑多少自己测
    */
}


