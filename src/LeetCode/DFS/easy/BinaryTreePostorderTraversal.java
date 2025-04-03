package LeetCode.DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      System.out.println(postorderTraversal(root));
   }

   public static List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      dfs(root, res);
      return res;
   }

   public static void dfs(TreeNode root, List<Integer> res) {
      if (root == null) return;
      if (root.left == null && root.right == null) {
         res.add(root.val);
      }else {
         dfs(root.left, res);
         dfs(root.right, res);
         res.add(root.val);
      }
   }
}
