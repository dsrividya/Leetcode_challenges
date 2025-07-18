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
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case: null node or found the node with the given value
        if (root == null || root.val == val) {
            return root;
        }

        // If the value is less than current node, search in the left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        } else { // Else search in the right subtree
            return searchBST(root.right, val);
        }
    }
}
