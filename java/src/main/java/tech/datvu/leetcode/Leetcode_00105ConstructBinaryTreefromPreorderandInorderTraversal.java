package tech.datvu.leetcode;

public class Leetcode_00105ConstructBinaryTreefromPreorderandInorderTraversal {

    private static int i;
    private static int j;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        i = j = 0;
        return build(preorder, inorder, Integer.MIN_VALUE);
    }

    public static TreeNode build(int[] preorder, int[] inorder, int right) {
        if (i >= preorder.length) {
            return null;
        }
        if (inorder[j] == right) {
            j++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[i++]);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, right);
        return node;
    }

    public static void main(String[] args) {
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };
        TreeNode root = buildTree(preorder, inorder);
        TreeNode.preTraversalNode(root);
        System.out.println("END PROGRAM.");
    }
}
