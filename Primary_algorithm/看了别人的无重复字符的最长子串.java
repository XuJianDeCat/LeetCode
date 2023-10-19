class Solution {
 public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // 使用HashMap集合
        HashMap<Character,Integer> hashMap = new HashMap<>(); // key：保存s字符串的字符，value：保存该字符的下标
        // 左侧位置
        int leftIndex = 0; // 位置从零开始，刚开始那不也不指向
        // 最大子串长
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            // 滑动窗口从这里开始， 在这题中，滑动窗口中的字符串并不是最大’无重复最大子字符串‘

            // 如果出现重复的字符，将之前加入的字符的位置（也就是下标+1）取出赋值给leftIndex,
            if (hashMap.containsKey(s.charAt(i))) {
                /*
                    * 为什么leftIndex还要是大返回
                    * 'abba',leftIndex最开始那也不指向，当滑动窗口滑动到第三个元素，leftIndex指向第二个元素b
                    * 然后滑动窗口从第三个元素b开始当，第四个元素进来，发现又重复了a，所以
                    * leftIndex要指向第一个元素a，那么就错了，第一个元素a已经被排除在滑动窗口内。
                    * 所以leftIndex代表了滑动窗口的左框
                    *
                 */
                if ( leftIndex < hashMap.get(s.charAt(i)) + 1) {
                    leftIndex = hashMap.get(s.charAt(i)) + 1; // leftIndex保存字符的位置，所以要下标加一
                }
            }

            // 往hashMap中保存字符数据
            hashMap.put(s.charAt(i),i);
            /*
                * 这一步是最重要的一步，滑动窗口也在这里体现
                * 分两种情况
                * 第一种，刚刚开始，窗口中的字符还没有出现重复。
                * leftIndex的值为0，i + 1 - leftIndex 代表了滑动窗口中不重复的字符个数
                * 第二种，就是出现了重复的字符，首先leftIndex会变成之前先加入的字符的位置（位置不是从零开始，详情看第二步）
                * 那么此时的i这个下标，也就是现在新发现的重复字符的下标，i + 1代表了这个新发现的重复字符的位置
                * i + 1 - leftIndex 代表去掉之前先加入的字符的前面的字符（包括它本身),同样也代表了滑动窗口的移动
                * 接着会和之前的max比较，大的保存到max里面
             */
            if (max < i + 1 - leftIndex) {
                max = i + 1 - leftIndex;
            }



        }
        return max;

    }
}


