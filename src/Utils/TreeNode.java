package Utils;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
   public int val;
   public TreeNode left;
   public TreeNode right;
   public TreeNode() {}
   public TreeNode(int val) { this.val = val; }
   public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
   }

   public static TreeNode buildTree(Integer[] arr) {
      if (arr.length == 0 || arr[0] == null) return null;
      Queue<TreeNode> queue = new LinkedList<>();
      TreeNode root = new TreeNode(arr[0]);
      queue.offer(root);
      for (int i = 1; i < arr.length; i++) {
         TreeNode parent = queue.poll();
         if (arr[i] != null) {
            parent.left = new TreeNode(arr[i]);
            queue.offer(parent.left);
         }
         if (++i < arr.length && arr[i] != null) {
            parent.right = new TreeNode(arr[i]);
            queue.offer(parent.right);
         }
      }
      return root;
   }
}