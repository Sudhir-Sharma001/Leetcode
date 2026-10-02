package BinaryTree;

public class L222_Count_Complete_Tree_Nodes {
    public static void main(String[] args) {
    }

    static class Solution {
        public int countNodes(TreeNode root) {
            if (root == null) return 0;

            int leftHeight = getLeftHeight(root);
            int rightHeight = getRightHeight(root);

            if (leftHeight == rightHeight) {
                return (1 << leftHeight) - 1;
            }

            return countNodes(root.left) + countNodes(root.right) + 1;
        }

        private int getLeftHeight(TreeNode root) {
            int height = 0;

            while (root != null) {
                height++;
                root = root.left;
            }

            return height;
        }

        private int getRightHeight(TreeNode root) {
            int height = 0;

            while (root != null) {
                height++;
                root = root.right;
            }

            return height;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}