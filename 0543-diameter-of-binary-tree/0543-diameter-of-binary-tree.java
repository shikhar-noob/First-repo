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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] best = new int[1];
        depth(root, best);
        return best[0];
    }

    private int depth(TreeNode node, int[] best) {
        if (node == null) return 0;

        int cl = depth(node.left, best);
        int cr = depth(node.right, best);

        best[0] = Math.max(best[0], cl + cr);

        return 1 + Math.max(cl, cr);
    }
}
        
    