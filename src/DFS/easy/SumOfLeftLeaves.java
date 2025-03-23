package DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

public class SumOfLeftLeaves {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      System.out.println(sumOfLeftLeaves(root));
   }

   public static int sumOfLeftLeaves(TreeNode root) {
      return dfs(root);
   }

   public static int dfs(TreeNode root) {
      if (root == null) return 0;
      int res = 0;
      if (root.left != null && root.left.left == null && root.left.right == null) {
         res += root.left.val;
      }
      res += dfs(root.left);
      res += dfs(root.right);
      return res;
   }
}
