class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        // hash the values with index
        for(int i =0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        int n = preorder.length-1;
        int m = inorder.length-1;
        TreeNode root = constructTree(preorder,inorder,mp,0,n,0,m);
        return root;
    }
    public static TreeNode constructTree(int[] preorder, int[] inorder,HashMap<Integer,Integer> mp,int preStart , int preEnd , int inStart,int inEnd){

        // handle the base case
        if(preStart>preEnd || inStart>inEnd ){
            return null;
        }
        int rootData = preorder[preStart];
        int idx = mp.get(rootData);
        TreeNode root = new TreeNode(rootData);
        int numsLeft = idx- inStart;
        root.left =  constructTree(preorder,inorder,mp,preStart+1,preStart+numsLeft,inStart,idx-1);
        root.right =  constructTree(preorder,inorder,mp,preStart+numsLeft+1,preEnd,idx+1,inEnd);
        return root;


    }

}