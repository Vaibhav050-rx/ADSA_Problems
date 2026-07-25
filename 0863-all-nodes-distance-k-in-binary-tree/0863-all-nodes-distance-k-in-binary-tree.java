class Solution {

    public void fillMap(TreeNode root, HashMap<TreeNode, TreeNode> parentMap) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node.left != null) {
                parentMap.put(node.left, node);
                queue.offer(node.left);
            }

            if (node.right != null) {
                parentMap.put(node.right, node);
                queue.offer(node.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> ans = new ArrayList<>();

        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        fillMap(root, parentMap);

        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int level = 0;

        while (!queue.isEmpty()) {

            if (level == k) {
                break;
            }

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                // Left
                if (node.left != null && !visited.contains(node.left)) {
                    queue.offer(node.left);
                    visited.add(node.left);
                }

                // Right
                if (node.right != null && !visited.contains(node.right)) {
                    queue.offer(node.right);
                    visited.add(node.right);
                }

                // Parent
                TreeNode parent = parentMap.get(node);

                if (parent != null && !visited.contains(parent)) {
                    queue.offer(parent);
                    visited.add(parent);
                }
            }

            level++;
        }

        while (!queue.isEmpty()) {
            ans.add(queue.poll().val);
        }

        return ans;
    }
}