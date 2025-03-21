package DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

public class PathSum {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      System.out.println(hasPathSum(root, 1));
   }

   public static boolean hasPathSum(TreeNode root, int targetSum) {
      if (root == null) return false;
      if (root.left == null && root.right == null) {
         if (root.val == targetSum) return true;
         else return false;
      }
      targetSum -= root.val;
      boolean res = hasPathSum(root.left, targetSum);
      if (!res)
         res = hasPathSum(root.right, targetSum);
      return res;
   }
}
