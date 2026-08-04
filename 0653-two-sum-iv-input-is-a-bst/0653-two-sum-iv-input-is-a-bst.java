class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root ,list, k);
        int start = 0;
        int  end =  list.size()-1;
        while(start<end){
            int sum = list.get(start)+ list.get(end);
            if(sum< k){
                start++;
            }else if(sum > k){
                end -- ;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void inorder(TreeNode root,ArrayList<Integer> list, int k){
        if(root == null) return ;
        inorder(root.left , list ,k);
        list.add(root.val);
        inorder(root.right ,list ,k);
    }
}