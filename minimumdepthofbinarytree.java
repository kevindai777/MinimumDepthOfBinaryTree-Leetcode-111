//Java Solution

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        stack.add(new Pair(root, 1));
        
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> curr = stack.poll();
            TreeNode node = curr.getKey();
            int depth = curr.getValue();
            
            if ((node.left == null) && (node.right == null)) {
                return depth;
            }
            
            if (node.left != null) {
                stack.add(new Pair(node.left, depth + 1));
            }
            
            if (node.right != null) {
                stack.add(new Pair(node.right, depth + 1));
            }
        }
        
        return 0;
    }
}