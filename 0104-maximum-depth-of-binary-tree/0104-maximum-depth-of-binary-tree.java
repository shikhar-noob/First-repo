class Solution{
public int maxDepth(TreeNode root) {
    if (root == null) return 0;

    int cl = maxDepth(root.left);
    int cr = maxDepth(root.right);

    return 1 + Math.max(cl, cr);}
}
