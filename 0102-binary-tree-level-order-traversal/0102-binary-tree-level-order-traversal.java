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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode Node = queue.poll();
                list.add(Node.val);
                if(Node.left!=null){
                    queue.add(Node.left);
                }
                if(Node.right!=null){
                    queue.add(Node.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}