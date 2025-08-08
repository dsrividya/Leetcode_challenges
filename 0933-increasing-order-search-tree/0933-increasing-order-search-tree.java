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
    private TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0); // Dummy node to act as previous node
        current = dummy;
        inorder(root);
        return dummy.right; // Right child of dummy is new root
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        // Remove left child
        node.left = null;
        // Attach current node to the right of 'current'
        current.right = node;
        // Move 'current' pointer
        current = node;

        inorder(node.right);
    }
}
