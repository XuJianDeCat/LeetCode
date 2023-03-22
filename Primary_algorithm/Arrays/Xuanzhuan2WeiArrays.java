// 自己写的题解：https://leetcode.cn/problems/rotate-image/solution/yong-javacao-zuo-yi-ci-fan-zhuan-zuo-xie-rdwr/
class Solution {
    public void rotate(int[][] matrix) {
            // 对二维矩阵的每一行都反转
            for (int i = 0; i < matrix.length; i++){
                int start = 0, end = matrix[i].length - 1;
                while(start < end) {
                  int   temp = matrix[i][start];
                    matrix[i][start] = matrix[i][end];
                    matrix[i][end] = temp;
                    start++;
                    end--; 
                }
            }
            // 开始交换，这一步
            int len = matrix.length;
            for (int i = 0, z = len - 1; i < len; i++,z--) {
                    for (int j = 0, k = len - 1; j <= z; j++, k--){
                       int   temp = matrix[i][j];
                    matrix[i][j] = matrix[k][z];
                    matrix[k][z] = temp;
                    }
            }

    }
}
