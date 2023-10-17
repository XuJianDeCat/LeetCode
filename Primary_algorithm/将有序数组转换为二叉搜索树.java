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
   public TreeNode sortedArrayToBST(int[] nums) {
        // 递归解决
        
        return dfs(nums, 0, nums.length - 1);
    }
    public TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 取数组中的元素作为根节点
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
        
        
    }
    /*
总结：深度优先中序遍历，取数组的中间数字，当做根节点，根据root把数组分为左子树和右子树，然后对左子树和右子树。同样使用这种办法，最后能够得到一颗高度平衡的二叉树。
    */
}