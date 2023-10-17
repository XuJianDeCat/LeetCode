class Solution {
    // public boolean isAnagram(String s, String t) {
        // 如果两个字符的长度不同就直接返回false
    //     if (s.length() != t.length()) {
    //         return false;

    //     }
    //     int[] count1 = new int[26];
    //     int[] count2 = new int[26];
    //     // 记录两个字符串中小写字母出现的次数
    //     for (int i = 0; i < s.length(); ++i) {
    //         count1[s.charAt(i) - 'a']++;
    //         count2[t.charAt(i) - 'a']++;
    //     }
    //     // 如果两个字符串相同，那么count数组中的元素只有0或2
    //     for (int i = 0; i < count1.length; i++) {
    //         if (count1[i] != count2[i]) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }
    // 且先不说占用多少空间，你运行速度都没有上来。怎么提速
    // 我觉得对它排序可能是个很好的办法
    // public static boolean isAnagram(String s, String t) {
    //     // 如果两个字符的长度不同就直接返回false
    //     if (s.length() != t.length()) {
    //         return false;

    //     }
    //     char[] a = s.toCharArray();
    //     char[] b = t.toCharArray();
    //     Arrays.sort(a);
    //     Arrays.sort(b);

    //     return Arrays.equals(a, b); // 比较两个数组的内容是否相等。
    // }
    // 除了上面两种，还有第三种哈希表法。这个哈希表确实给我带来了一些领悟，有些东西它存在，它的作用，名字都是人赋予的，所以我应该要学会使用这种思想，而并不是成为这种工具的使用者，若仅仅凭努力来比，没有人谁能比的过谁，但是思想上的东西就说不定了。
        public static boolean isAnagram(String s, String t) {
        // 如果两个字符的长度不同就直接返回false
        if (s.length() != t.length()) {
            return false;

        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int a : count) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }
        // 这个思想确实不错，但是速度还是低了，但空间复杂度低

        /*
        1、第一种两个数组，记录两个字符串中的字母出现的次数。然后比较
        2、第二种，将两个字符串转成字符数组，然后先排序，然后比较排序后的数组
        3、第三种，用26位的整数数组当哈希表，第一个字符串中的字符在里面整数数组就加加，另一个字符串中的数组在里面就减减，如果两个字符串相等整数数组中的元素就0
        */
}