class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root , targetSum , ans,list);
        return ans;
    }
    public static void helper(TreeNode root ,int targetSum,List<List<Integer>> ans,List<Integer> list ){
        if(root == null) return;
        targetSum-=root.val;
        list.add(root.val);
        if(root.left==null && root.right == null){
            if(targetSum==0){
                ans.add(new ArrayList<>(list));
            }
        }
        helper(root.left,targetSum,ans,list);
        helper(root.right,targetSum,ans,list);
        list.remove(list.size() - 1); 
        
    }
        
}