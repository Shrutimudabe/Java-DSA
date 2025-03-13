class Solution {
    public List<Integer> levelOrder(TreeNode root) {
       List<Integer> levelOrder = new ArrayList<>();
        helper(root,levelOrder);
        return levelOrder;
    }
    public void helper(TreeNode root,List<Integer>result){
       Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(q.size()>0){
            TreeNode n = q.remove();
            result.add(n.val);

            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
        }
    }
}
