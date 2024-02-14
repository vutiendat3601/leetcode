package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00257BinaryTreePaths {

    // private static List<String> res = new ArrayList<>();

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        findPath(root, res, new StringBuilder());
        return res;
    }

    public static void findPath(TreeNode root, List<String> res, StringBuilder path) {
        path.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(path.toString());
            return;
        }
        path.append("->");
        int len = path.length();
        if (root.left != null) {
            findPath(root.left, res, path);
            path.setLength(len);
        }
        if (root.right != null) {
            findPath(root.right, res, path);
            path.setLength(len);
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.right = n5;
        binaryTreePaths(n1).forEach(e -> System.out.println(e));
    }
}
