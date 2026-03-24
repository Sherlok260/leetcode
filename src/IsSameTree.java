class TreeNode {
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

public class IsSameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if ((p != null && q == null) || (p == null && q != null)) {
            System.out.println("bnm");
            return false;
        } else if (p != null && q != null) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            System.out.println(2);
            return true;
        }

    }


    public static void main(String[] args) {
        var result = isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3))
                ,
                new TreeNode(1, new TreeNode(2), new TreeNode(3))
        );
        System.out.println(result);
    }
}
