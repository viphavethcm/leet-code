package LeetCode.DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderReversal {

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      List<Integer> res = inorderTraversal(root);
      System.out.println(res);
   }

   public static List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      dfs(root, res);

      return res;
   }

   public static void dfs(TreeNode root, List<Integer> res) {
      if (root == null) return;
      if (root.left == null && root.right == null){
         res.add(root.val);
      }else {
         dfs(root.left, res);
         res.add(root.val);
         dfs(root.right, res);
      }
   }
}
