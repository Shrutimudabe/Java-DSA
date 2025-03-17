class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
         if(p==null && q==null){
            return true;
         }
         if(p==null || q==null){
            return false;
         }
         boolean con1 = (p.val == q.val);
         boolean con2 = isSameTree(p.left,q.left);
         boolean con3 = isSameTree(p.right,q.right);

    return con1 && con2 && con3;
    }
}
