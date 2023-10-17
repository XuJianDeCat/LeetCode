/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        TreeNode leftNood = root.left;
        TreeNode rightNood = root.right;
       return isSymmetric1(leftNood, rightNood);

    }
    public boolean isSymmetric1(TreeNode leftNood, TreeNode rightNood) {
        /*
        递归的两大特点，调用自己，边界条件
        边界条件
        1、左右两边相同是一个边界条件。
        2、左右两边不同也是一个边界条件
        
         */
         // 左右都是空
        if (leftNood == null && rightNood == null) {
            return true;
        }
        // 左右有一个为空
        if (leftNood == null || rightNood == null) {
            return false;
        }
        // 左右的值不相等
        if (leftNood.val != rightNood.val) {
            return false;
        }

        // 最后这种就是左右不为空且值又相等，就会走到下一步检查
        return isSymmetric1(leftNood.left, rightNood.right) && isSymmetric1(leftNood.right,rightNood.left);




    }
}