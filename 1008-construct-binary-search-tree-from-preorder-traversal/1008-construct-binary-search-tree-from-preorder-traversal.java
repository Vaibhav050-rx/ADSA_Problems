class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[]index={0};
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE,index);
    }
    public static TreeNode helper(int[]preorder,int min,int max,int[]index){
        if(index[0]==preorder.length) return null;
        int val = preorder[index[0]];
        if(val<=min || val>=max){
            return null;
        }
        TreeNode root = new TreeNode(val);
        index[0]++;
        root.left = helper(preorder,min,root.val,index);
        root.right = helper(preorder,root.val,max,index);
        return root;
    }
}