package LeetCode.DFS.easy;

import Utils.TreeNode;

public class SameTree {

   public static void main(String[] args) {
      TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
      TreeNode q = new TreeNode(1, new TreeNode(3), new TreeNode(3));
//      TreeNode p = new TreeNode(1, new TreeNode(2), null);
//      TreeNode q = new TreeNode(1, null, new TreeNode(2));
      boolean res = isSameTree(p, q);
      System.out.println(res);
   }

   public static boolean isSameTree(TreeNode p, TreeNode q) {
      return dfs(p, q);
   }

   public static boolean dfs(TreeNode p, TreeNode q) {
      if (p == null && q == null)
         return true;
      if (p == null || q == null || p.val != q.val)
         return false;
      boolean res = dfs(p.left, q.left);
      if (res) res = dfs(p.right, q.right);
      return res;
   }
}
