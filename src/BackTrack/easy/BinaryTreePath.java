package BackTrack.easy;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(6), null), new TreeNode(5)), new TreeNode(3));
        List<String> rs = new ArrayList<>();
        binaryTreePaths(root);
        dfs(root, "", rs);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
       List<String> paths = new ArrayList<>();
       if (root != null) {
          dfs(root, "", paths);
       }
       return paths;
    }

    public static void dfs(TreeNode root, String path, List<String> paths) {
         if (root == null) {
            return;
         }
         path += root.val;
         if (root.left == null && root.right == null) {
            paths.add(path);
         }else {
            path += "->"; // Thêm dấu "->" nếu chưa phải node lá
            dfs(root.left, path, paths); // Đệ quy với node con bên trái
            dfs(root.right, path, paths);
         }

    }
}
