package DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

public class BalancedBinaryTree {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);
      System.out.println(isBalanced(root));
   }

   public static boolean isBalanced(TreeNode root) {
      return dfs(root) != -1;
   }

   public static int dfs(TreeNode root) {
      if (root == null) return 0;
      int left = dfs(root.left);
      int right = dfs(root.right);
      if (left == -1 || right == -1) return -1;
      if (Math.abs(left - right) > 1) return -1;
      return Math.max(left, right) + 1;
   }
}
