class Solution {
       public static String  longestCommonPrefix(String[] strs) {
        // if (strs.length == 1 && strs[0].length() == 0) {
        //     return "";
        // }

        // 最后的结果
        String res = "";
        // 最短匹配长度假设是第一个数组字符串的长度
        int minLength = strs[0].length();
        // 最长公共前缀
//        String str = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // 最短匹配长度的中间值
            int temp = 0;
            // 判断两个字符数组元素中的第一个下标中的第一个元素是否相同。
            if (strs[0].length() == 0 || strs[i].length() == 0 || strs[0].charAt(0) != strs[i].charAt(0) ) {
                return "";
            }
            // 两个字符串数组最短的长度当做for循环的条件
        int n = strs[0].length() < strs[i].length() ? strs[0].length() : strs[i].length();
            int j = 0;
            for (; j < n; j++) {
                if (strs[0].charAt(j) == strs[i].charAt(j)) {
                    temp++;
                } else {
                    if ( temp < minLength) {
                        minLength = temp;
                    }
                    break;
                }
            }
            if (j == n && temp < minLength) {
                    minLength = n;
            }

        }
    res = strs[0].substring(0, minLength);
    return res;
    }



}