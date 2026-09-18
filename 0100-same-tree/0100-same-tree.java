class Solution {
    public boolean isSameTree(TreeNode q, TreeNode p) {
       
        if (q == null && p == null) {
            return true;
        }

      
        if (q == null || p == null) {
            return false;
        }

       
        if (q.val != p.val) {
            return false;
        }

        
        return isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
    }
}