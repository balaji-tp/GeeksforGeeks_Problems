class Solution {
    // O(logN * logN)
    public int countNodes(TreeNode root) {
        int depth = depth(root);

        return count(root, depth);
    }

    private int count(TreeNode root, int depth) {
        if (root == null)
            return 0;

        boolean isLeftPerfect = isPerfect(root.left, depth - 1);

        if (isLeftPerfect)
            return 1 + nodesInPerfectTree(depth - 1) + count(root.right, depth - 1);
        else
            return 1 + count(root.left, depth - 1) + nodesInPerfectTree(depth - 2);

    }

    private int nodesInPerfectTree(int depth) {
        return (int) Math.pow(2, depth) - 1;
    }

    // O(logN)
    private boolean isPerfect(TreeNode root, int depth) {
        while (root != null) {
            root = root.right;
            depth--;
        }

        return depth == 0;
    }

    // O(logN)
    private int depth(TreeNode root) {
        int count = 0;

        while (root != null) {
            count++;
            root = root.left;
        }

        return count;
    }
}