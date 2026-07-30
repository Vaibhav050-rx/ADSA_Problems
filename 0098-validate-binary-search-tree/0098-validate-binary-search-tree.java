class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidate(TreeNode root,long minVal,long maxVal){
        if(root == null) return true ;
        if(root.val<=minVal || root.val>=maxVal){
            return false;
        }
        boolean left = isValidate(root.left,minVal,root.val);
        boolean right = isValidate(root.right,root.val,maxVal);
        return left && right;
    }
}