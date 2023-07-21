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

        if(helperTreeNode(root, targetSum)) {
            System.out.println(summ);
            summ = 0;
            return true;
        }
        else {
            System.out.println(summ);
            summ = 0;
            return false;
        }
    }

    static int summ = 0;
    static boolean isSumm = false;
    public static boolean helperTreeNode(TreeNode node, int targetSum) {
        if(node != null && node.left != null && node.left.left != null) {
            summ += node.val;
            helperTreeNode(node.left, targetSum);
        } else {
            summ += node.val;
            if(node.left != null && summ + node.left.val == targetSum) isSumm = true;
            else if(node.right != null && summ + node.right.val == targetSum) isSumm = true;
            else isSumm = false;
        }
        return isSumm;
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

    }

}
