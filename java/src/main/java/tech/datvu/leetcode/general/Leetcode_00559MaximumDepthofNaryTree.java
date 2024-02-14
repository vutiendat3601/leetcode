package tech.datvu.leetcode.general;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_00559MaximumDepthofNaryTree {

    public static int maxDepth(NTreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null) {
            return 1;
        }
        int max = 0;
        for (NTreeNode node : root.children) {
            max = Integer.max(max, maxDepth(node));
        }
        return max + 1;
    }

    public static void main(String[] args) {
        NTreeNode root = new NTreeNode();
        List<NTreeNode> children1 = new LinkedList<>();
        children1.add(new NTreeNode(3));
        children1.add(new NTreeNode(2));
        children1.add(new NTreeNode(4));
        root.children = children1;
        List<NTreeNode> children2 = new LinkedList<>();
        children2.add(new NTreeNode(5));
        children2.add(new NTreeNode(6));
        children1.get(0).children = children2;

        int res = maxDepth(root);
        System.out.println(res);
    }
}

class NTreeNode {
    public int val;
    public List<NTreeNode> children;

    public NTreeNode() {
    }

    public NTreeNode(int val) {
        this.val = val;
    }
}