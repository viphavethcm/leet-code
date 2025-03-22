package DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      List<Integer> res = preorderTraversal(root);
      System.out.println(res);
   }
   public static List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      dfs(root, res);
      return res;
   }

   public static void dfs(TreeNode root, List<Integer> res) {
      if (root == null) return;
      res.add(root.val);
      dfs(root.left, res);
      dfs(root.right, res);
   }
}
