class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null)
            return true;

        if (root == null)
            return false;

        // Found a possible starting point
        if (sameTree(root, subRoot))
            return true;

        // Search left and right
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public boolean sameTree(TreeNode root, TreeNode subRoot) {

        // Both are null → identical
        if (root == null && subRoot == null)
            return true;

        // One is null → different
        if (root == null || subRoot == null)
            return false;

        // Values differ → different
        if (root.val != subRoot.val)
            return false;

        // Both sides must match
        return sameTree(root.left, subRoot.left) &&
               sameTree(root.right, subRoot.right);
    }
}