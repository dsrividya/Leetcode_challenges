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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        preorder(root, ll);
        return ll;
    }

    private void preorder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.val);             // Visit root
        preorder(node.left, list);      // Traverse left
        preorder(node.right, list);     // Traverse right
    }
}
