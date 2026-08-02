class BSTIterator {
    public Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode temp  = st.pop();
        pushAll(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        if(!st.isEmpty()) return true;
        else return false;
    }
    public void pushAll(TreeNode root){
        while(root!=null){
            st.push(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */