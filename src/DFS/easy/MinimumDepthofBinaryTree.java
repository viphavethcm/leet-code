package DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

public class MinimumDepthofBinaryTree {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);
      System.out.println(minDepth(root));
   }

   public static int minDepth(TreeNode root) {
      if(root == null) return 0;
      int left = minDepth(root.left);
      int right = minDepth(root.right);
      if (left == 0) {
         return right + 1;
      }
      if (right == 0) {
         return left + 1;
      }
      return 1 + Math.min(left, right);
   }
}
