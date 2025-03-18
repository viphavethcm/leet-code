package DFS.easy;

import Utils.TreeNode;

public class SymmetricTree {

   public static void main(String[] args) {
//      TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
      TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
      System.out.println(isSymmetric(root));
   }

   public static boolean isSymmetric(TreeNode root) {
      TreeNode p = root.left;
      TreeNode q = root.right;
      boolean isSymmetric = dfs(p, q);
      return isSymmetric;
   }

   public static boolean dfs(TreeNode p, TreeNode q) {
      if (p == null && q == null) return true;
      if (p == null || q == null) return false;
      if (p.val != q.val) return false;
      boolean res = dfs(p.left, q.right);
      if (res)
         res = dfs(p.right, q.left);
      return res;
   }
}
