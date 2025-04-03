package LeetCode.DFS.easy;

import static Utils.TreeNode.buildTree;
import static Utils.Utils.readInput;

import Utils.TreeNode;

public class MinimumAbsoluteDifferenceInBST {

   private static int minDiff = Integer.MAX_VALUE;
   private static Integer prev = null;

   public static void main(String[] args) {
      Integer[] arr = readInput();
      TreeNode root = buildTree(arr);

      System.out.println(getMinimumDifference(root));
   }

   public static int getMinimumDifference(TreeNode root) {
      dfs(root);
      return minDiff;
   }

   public static void dfs(TreeNode root) {
      if (root == null) return;

      dfs(root.left);  // Duyệt trái

      // So sánh khoảng cách với node trước đó
      if (prev != null) {
         minDiff = Math.min(minDiff, root.val - prev);
      }
      prev = root.val; // Cập nhật prev với giá trị hiện tại

      dfs(root.right); // Duyệt phải
   }

// Cách 1: Duyệt In Order và store danh sách cách node theo thứ tự tăng dần vào 1 list. Sau đó loop list và tính
//   public static int getMinimumDifference(TreeNode root) {
//      List<Integer> inOrder = new ArrayList<>();
//      dfs(root, inOrder);
//      int max = Integer.MAX_VALUE;
//      for (int i = 0; i < inOrder.size() - 1; i++){
//         int abs = Math.abs(inOrder.get(i+1) - inOrder.get(i));
//         if (abs < max) {
//            max = abs;
//         }
//      }
//      return max;
//   }
//
//   public static void dfs(TreeNode root, List<Integer> inOrder) {
//      if (root == null) return;
//      dfs(root.left, inOrder);
//      inOrder.add(root.val);
//      dfs(root.right, inOrder);
//   }
}
