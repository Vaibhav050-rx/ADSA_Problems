class Solution {
    public int countNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum =0;
        while(!queue.isEmpty()){
            if(root == null) return 0;
            int size=queue.size();
            sum+=size;
            for(int i =0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return sum;
            
    }
}