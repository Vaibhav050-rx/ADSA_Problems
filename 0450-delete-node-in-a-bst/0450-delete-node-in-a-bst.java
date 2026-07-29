class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(key < root.val){
            root.left= deleteNode(root.left,key);
        }else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }else{
            // key == root.val
            if(root.left==null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                // inorder predecessor
                TreeNode node = findPredecessor(root.left);
                root.val = node.val;
                // delete node.val
                root.left= deleteNode(root.left,node.val);
            }
        }
        return root;
    }
    public TreeNode findPredecessor(TreeNode node){
        TreeNode curr = node;
        while(curr.right!=null){
            curr = curr.right;
        }
        return curr;
    }
}