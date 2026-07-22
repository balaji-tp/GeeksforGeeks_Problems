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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;

        pathFinder(root, list, "");
        return list;
    }

    private void pathFinder(TreeNode root, List<String> list, String s) {
        if (root == null)
            return;

        s += root.val; // Add current node value

        // If leaf node, add full path to result
        if (root.left == null && root.right == null) {
            list.add(s);
            return;
        }

        // Otherwise, keep traversing with "->"
        pathFinder(root.left, list, s + "->");
        pathFinder(root.right, list, s + "->");
    }
}