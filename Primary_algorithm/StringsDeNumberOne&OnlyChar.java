class Solution {
 public int firstUniqChar(String s) {
            
            int[] count = new int[26];
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }
            int index = 0;
            for (char ch : s.toCharArray()) {
                if (count[ch - 'a'] == 1) {
                    return index;
                }
                ++index;
            }
         return -1;
    }
    // 这题能解出来，主要是解决中怎么处理字符串的问题，跟我们人如何去处理食材是一样的道理，将字符串处理成字符数组。
}