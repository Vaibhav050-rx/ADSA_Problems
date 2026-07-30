class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list,k);
        return list.get(k-1);
    }
    public static void inorder(TreeNode root,ArrayList<Integer> list,int k ){
        if(root == null) return ;
        inorder(root.left,list,k);
        list.add(root.val);
        inorder(root.right,list,k);
    }
}