class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length!=postorder.length){
            return null;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return constructBinaryTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
    }
    public TreeNode constructBinaryTree(int[] inorder,int is,int ie ,int[] postorder,int ps,int pe,HashMap<Integer,Integer> mp){
        if(ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int inRoot = mp.get(postorder[pe]);
        int numsLeft = inRoot-is;
        root.left=constructBinaryTree(inorder,is,inRoot-1,postorder,ps,ps+numsLeft-1,mp);
        root.right=constructBinaryTree(inorder, inRoot+1, ie ,postorder,ps+numsLeft,pe-1,mp);
        return root;
    }
}