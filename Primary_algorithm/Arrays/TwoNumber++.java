class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 解决算法的第一要素，充分利用可用东西，提高速度减少内存，谁管你用的什么方法
        // 又一次使用容器，HashMap容器，如果HashMap容器中有 target - nums[i] 的结果，那么就返回结果
        // 如果没有那就将结果 (nums[i],i)存入HashMap中去。
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            // containsKey()判断传入的key值在map中有对应的映射没，有就返回true，没有就false
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        } 
       throw new IllegalArgumentException("No two sum solution");
    } // 像HashMap，HashSet这些容器不熟悉，它们的方法更加不知道了，写题的作用其实就是找解题的方法，和学习自己不会的东西。
}