package LeetCode.DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

public class EvaluateBooleanBinaryTree {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      System.out.println(evaluateTree(root));
   }
// 0 = False, 1 = True, 2 = OR, 3 = AND --> 0 AND 1 = 1, 0 OR 1 = 1
   public static boolean evaluateTree(TreeNode root) {
      if (root == null) return false;
      if (root.left == null && root.right == null)
         return root.val == 1;
      if (root.left == null)
         return evaluateTree(root.right);
      if (root.right == null)
         return evaluateTree(root.left);
      if (root.val == 2)
         return evaluateTree(root.left) || evaluateTree(root.right);
      else
         return evaluateTree(root.left) && evaluateTree(root.right);
   }

}
