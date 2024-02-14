package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00094BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root != null) {
            Stack<TreeNode> s = new Stack<>();
            TreeNode curNode = root;
            while (curNode != null || !s.empty()) {
                while (curNode != null) {
                    s.push(curNode);
                    curNode = curNode.left;
                }
                curNode = s.pop();
                res.add(curNode.val);
                curNode = curNode.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode
                .createFromArray(new Integer[] { 1, 2, 3, 4, 5, 6, 7, null, null, -10, null, null, null, null, null });
        // .createFromArray(new Integer[] { 1, null, 2, 3 });
        List<Integer> res = inorderTraversal(root);
        res.forEach(i -> System.out.print(i + " "));
    }
}
