class Solution {
    public int reverse(int x) {
    // if (x == 0) {return x;}
    // int ch = 1;
    // if (x < 0) {ch = -1; x *= ch;}
    // String str1 = Integer.toString(x);
    // StringBuilder str2 = new StringBuilder(str1);
    // str2.reverse();
    // str1 = str2.toString();
    // try{
    //      x = Integer.parseInt(str1); // str1中的数字太大，int类型装不下
    // } catch (NumberFormatException e){
    //     return 0;
    // }
   
    // x *= ch;
    // if ((x >= -2147483648) && (x <= 2147483647)) {
    //     return x;
    // }   
    // return 0;
    // 上面这个写的好烂 “”
     if (x == 0) {return x;}
     int res = 0;
     int temp = 0;
    while (x != 0) {
        temp = x % 10;
        /* 先前条件
        -2^31       ~      2^31 - 1
        -214748364 8 ~      214748364 7   拾亿位
        */
        if ((res > 214748364) || (res == 214748364 && temp > 7)){ return 0;}
// 如果这个要被返回的结果(res)大于 214748364 ，
// 那么后面加上取余得来的什么temp数值都会比2147483647（2^31 - 1）大。
// 如果这个要被返回的结果（res）等于214748364，
// 那么这个要被加上的temp数值就不能大于7，如果大于就一定会比2147483647（2^31 - 1）大。
        if ((res < -214748364) || (res == -214748364 && temp < -8)){ return 0;}
        // 下面的同理
        res = res * 10 + temp;
        x /= 10;
    }
    return res;   
    }
}
