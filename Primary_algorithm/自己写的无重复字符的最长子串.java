class Solution {
public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashSet.add(s.charAt(i))) {

            } else {
                // 保留最长子字符串
                if (max < hashSet.size()) {
                    max = hashSet.size();
                }
                i = i - hashSet.size() + 1;
                hashSet.clear(); // 清空HashSet
                hashSet.add(s.charAt(i));
            }


        }
        if (max < hashSet.size()) {
            max = hashSet.size();
        }
        return max;
    }
}
/*
    * 我并不是使用的滑动窗口。
    * 我使用的更加暴力的方法，比如“abcabcbb”，从abc加入hashSet中，下一位出现了a，我就清空hashSet，再从下标为1的b开始重新向hashSet中添加。
    结果就是我的空间和时间复杂度都比别人的要高
*/

