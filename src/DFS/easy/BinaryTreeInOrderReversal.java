package DFS.easy;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTreeInOrderReversal {

   public static void main(String[] args) {
      TreeNode root = new TreeNode(37 , new TreeNode(-34, null, new TreeNode(-100)), new TreeNode(-48, new TreeNode(-100), new TreeNode(48, new TreeNode(-54, new TreeNode(-71), new TreeNode(-22, null, new TreeNode(8))), null)));
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
