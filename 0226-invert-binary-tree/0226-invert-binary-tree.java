class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root ==null){
            return null;
        }
        TreeNode Node = root.left;
        root.left=root.right;
        root.right=Node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}