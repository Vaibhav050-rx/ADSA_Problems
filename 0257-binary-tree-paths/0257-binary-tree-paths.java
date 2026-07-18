class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root,"",ans);
        return ans;
    }
    public static void helper(TreeNode root ,String path, List<String> ans){
        if(root == null) return ;
        if(root.left==null && root.right == null){
            path = path + root.val;
            ans.add(path);
            return ;
        }
        helper(root.left,path +root.val+"->",ans);
        helper(root.right,path +root.val+"->",ans);
        
    }
}