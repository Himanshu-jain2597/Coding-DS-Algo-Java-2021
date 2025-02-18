class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
      if (root1 == null && root2 == null) return true;
      else if (root1 != null && root2 != null) {
        if (root1.val != root2.val) return false;
      } else if (root1 != null && root2 == null || root1 == null && root2 != null) return false;

      return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)
          || flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
    }
}
