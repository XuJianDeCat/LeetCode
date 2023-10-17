class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*
         // 三个二维数组用来记录行，列，3x3格子中的数字，注意：我们用数组下标来记录数字1-9，在数组中对应的下标是0-8
            // 对行，列的数组解释row[0][0]代表的是第一行数字1是否存在，column[1][1]代表第2列数字2是否存在。，cell[i][j]3x3格子代表第几个格子中有没有这个数字
            // 反正你注意你所谓的第几行或者第几列或者第几个格子在二维数组中使用下标表示就要减1
        // 看懂题目 看懂题目 看懂题目 看懂题目 看懂题目 看懂题目 看懂题目 看懂题目 看懂题目 看懂题目
        // 题目是求现在给你的这个9x9数独已经填入的数字是否满足数独的规则，并不是要你去把这个数独补充完整。
            int[][] row = new int[9][9];
            int[][] column = new int[9][9];
            int[][] cell = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        continue; // 如果9x9数独第i个j列没有数字就直接跳过
                    }
                    //如果有数字，就要先求出这个数字，然后再判读这个数字是否在行，列，3x3的格子里有没有重复。
                    int num = board[i][j] - '0' - 1; // 因为在这里使用数组下标0-8代表数字1-9。所以要减1
                    // 求出在那个小格子中
                    int k = i / 3 * 3 + j / 3;
                    // 如果这个num数字在第i行或者第j列或者第k个格子中不等于0，也就num已经存在了，那么就违反了数独的规则，直接返回false
                    if (row[i][num] != 0 || column[j][num] != 0 || cell[k][num] != 0 ) {
                        return false;
                    }
                    // 否则就将num数字记录在第i行和第j列和第k个格子中
                    row[i][num] = column[j][num] = cell[k][num] = 1;
                }
            }
            // 如果这个数独通过了上面 的 判断就说明它是一个合法的数独，返回true
        return true;
    }
*/
    // 位运算来解决
                    // row[0] = 0b001010100代表第一行中存在数字3,5,7，这个三个数字（记住从右往左开始数1在那一位，1在第三位就代表数字3）
            int[] row = new int[9];
            int[] column = new int[9];
            int[] cell = new int[9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        continue; // 如果9x9数独第i个j列没有数字就直接跳过
                    }
                    //如果有数字，就要先求出这个数字，然后再判读这个数字是否在行，列，3x3的格子里有没有重复。
                    int shift = 1 << (board[i][j] - '0' - 1);
                    // 求出在那个小格子中
                    int k = i / 3 * 3 + j / 3;

                    if ((row[i] & shift) > 0 || (column[j] & shift) > 0 || (cell[k] & shift) > 0 ) {
                        return false;
                    }
                    // 否则就将num数字记录在第i行和第j列和第k个格子中
                    row[i] |= shift;
                    column[j] |= shift;
                    cell[k] |= shift;
                    
                }
            }
            // 如果这个数独通过了上面 的 判断就说明它是一个合法的数独，返回true
        return true;
}
}


