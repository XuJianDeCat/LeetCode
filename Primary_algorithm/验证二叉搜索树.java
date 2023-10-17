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
   public boolean isValidBST(TreeNode root) {
     // 前序遍历
        return isValidBST1(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST1(TreeNode nood, Long left, Long right) {
            if (nood == null) {
                return true;
            }
            long x = nood.val;
            return x > left && x < right &&
                    isValidBST1(nood.left, left, x) &&
                    isValidBST1(nood.right, x,right);
            
    }
}