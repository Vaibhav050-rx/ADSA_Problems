class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);
        if(leftHeight == rightHeight){
            return  (int)Math.pow(2, leftHeight) - 1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int getLeftHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getLeftHeight(root.left);
    }

    public int getRightHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getRightHeight(root.right);
    }
}