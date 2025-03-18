package DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

public class MaximumDepthOfBinaryTree {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      System.out.println(maxDepth(root));
   }

   public static int maxDepth(TreeNode root) {
      if(root == null) return 0;
      int left = 1 + maxDepth(root.left);
      int right = 1 + maxDepth(root.right);
      return Math.max(left, right);
   }

   public static void dfs(TreeNode root, int res) {
      if (root == null) return;
      res += 1;
      dfs(root.left, res);
      dfs(root.right, res);
   }

}
