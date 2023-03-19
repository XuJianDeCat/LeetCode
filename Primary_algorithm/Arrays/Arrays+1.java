class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

            for (int i = len - 1; i >= 0; i--) {
                // 优化空循环，也就是说进位了并非99,999，等情况，439空循环两次
                digits[i]++;
                digits[i] %= 10; // 如果digits[i] % 10的结果不等于0，则意味着没有
                if (digits[i] != 0) {
                    return digits;
                    }
                
            }
            digits = new int[len + 1];
            digits[0] = 1;
            return digits;
        // 先读懂题目意思，这很重要；
        // 从大局观上看题目，能否分两到三种情况，最后写代码。
        // 这里第一种情况：最右边的数组元素小于9或者从右开始是9元素的不连续
        // 梨子：432,483499，33449039
        // 第二种：全是9
        // 梨子：9,99，999，9999
        
    }
}