/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class CustomNode {
        TreeNode node;
        long index;
        CustomNode(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<CustomNode> queue = new LinkedList<>();
        queue.offer(new CustomNode(root,0));
        long maxWidth = 0;
        while(!queue.isEmpty()){
            long firstIdx = 0;
            long lastIdx = 0;
            long minIdx= queue.peek().index;
            int size=queue.size();
            for(int i =0;i<size;i++){
                CustomNode customNode = queue.poll();
                TreeNode node = customNode.node;
                long idx = customNode.index - minIdx;
                if(node.left!=null){
                    queue.offer(new CustomNode(node.left,2*idx + 1));
                } 
                if(node.right!=null){
                    queue.offer(new CustomNode(node.right,2*idx + 2));
                }
                
                if(i==0){
                    firstIdx=idx;
                }
                if(i==size -1){
                    lastIdx=idx;
                }
            }
            long width = lastIdx-firstIdx+1;
            maxWidth = Math.max(maxWidth,width);

        }
        return(int) maxWidth;
    }
}