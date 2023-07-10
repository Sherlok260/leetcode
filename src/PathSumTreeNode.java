public class PathSumTreeNode {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        helperTreeNode(root, targetSum);
        System.out.println(summ);
        if(summ == targetSum) {
            summ = 0;
            return true;
        }
        else {
            summ = 0;
            return false;
        }
    }

    static int summ = 0;
    public static void helperTreeNode(TreeNode node, int targetSum) {

        if (node != null) {
            if(node.left != null && node.left.left != null) {
                summ += node.val;
                helperTreeNode(node.left, targetSum);
            } else {
                summ += node.val;
                if(node.left != null) {
                    if(summ + node.left.val == targetSum) {
                        summ += targetSum;
                        node = null;
                    }
                } else if(node.right != null) if (summ + node.right.val == targetSum) {
                        summ += targetSum;
                        node = null;
                    }
                }
            }
        }

    public static void main(String[] args) {
        TreeNode first = new TreeNode(5,
                new TreeNode(4,
                            new TreeNode(11,
                                    new TreeNode(7, null, null), new TreeNode(2, null, null)),
                            null),
                new TreeNode(8,
                        new TreeNode(13, null, null),
                        new TreeNode(4, null, new TreeNode(1, null, null)))
        );

        TreeNode node = new TreeNode(1, new TreeNode(2, null, null), null);

        System.out.println(hasPathSum(first, 22));
    }

}
