class Solution {
    public  boolean isPalindrome(String s) {
        // 如果字符串为空就返回true
        if (s.isEmpty()) {
            return true;
        }
        // 将s字符串转换成小写
        String str1 = s.toLowerCase();

        String str2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(str1.charAt(i))){
                str2 += str1.charAt(i);
            }
        }
        // 首指针和尾指针
        int start = 0;
        int end = str2.length() - 1;
        while (start < end) {
            if (str2.charAt(start) != str2.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    // 算法题是这样的，如果以后笔试，还真不能记住那么多的API，所以你用这么多的API不好。
}