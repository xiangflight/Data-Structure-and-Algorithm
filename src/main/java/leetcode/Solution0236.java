package leetcode;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/22
 */

class Solution0236 {

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left: right;
    }
}
