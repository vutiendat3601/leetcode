package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00095UniqueBinarySearchTreesII {

    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        List<TreeNode> res = gen(1, n);
        return res;
    }

    private static List<TreeNode> gen(int left, int right) {
        List<TreeNode> res = new ArrayList<>();
        if (left > right) {
            res.add(null);
        } else {
            for (int i = left; i <= right; i++) {
                List<TreeNode> leftNodes = gen(left, i - 1);
                List<TreeNode> rightNodes = gen(i + 1, right);
                for (TreeNode l : leftNodes) {
                    for (TreeNode r : rightNodes) {
                        TreeNode node = new TreeNode(i);
                        node.left = l;
                        node.right = r;
                        res.add(node);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        List<TreeNode> res = generateTrees(n);
        res.forEach(e -> TreeNode.traverLevel(e));
    }
}
