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
    public  List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        // 层序遍历
        // 还有一个什么最短路径也是用广度优先遍历
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list1 = new ArrayList();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                // 出队列
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                list1.add(node.val);
            }
            list.add(list1);
        }
                 return list;
    }
}
/*
总结：这个问题最重要的解决思路是在哪里？
首先想到层序遍历问题第一个要想到使用广度优先算法？其次是怎么一层一层的遍历它们。
广度优先算法倒也简单。一层一层遍历就要在遍历每一层之前知道这一层的节点个数
*/